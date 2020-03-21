package jp.artan.core.food;

import jp.artan.core.event.IBlockRegisterEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;

/**
 * 作物ブロックを作成するクラス
 * @apiNote
 * ./blockstates/${name}.json
 *      成長段階に合わせたブロックの情報を記述（０～７の８段階）
 * ./models/block/${name}_${Age(0~7)}.json
 *      成長段階に合わせたブロックのテクスチャ情報を記述
 * ./models/item/${name}.json
 *      ブロックの情報を記述
 * ./textures/block/${name}_${Age(0~7)}.png
 *      ブロックの情報を記述
 */
public abstract class CustomPlant extends BlockCrops implements IBlockRegisterEvent {
    protected final String name;

    public CustomPlant(String name) {
        super();
        this.name = name;
        this.setUnlocalizedName(this.name);
    }

    public abstract Item getSeed();

    public abstract Item getCrop();

    @Override
    public void registerBlock(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(this);
    }

    @Override
    public void registerModel(String modId, ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
                new ModelResourceLocation(new ResourceLocation(modId, this.name), "inventory"));
    }

    @Override
    public void registerItemBlocks(String modId, RegistryEvent.Register<Item> event) {
        // 食物ブロックはアイテムとして入手不可能ブロックなので、何もしない
    }
}

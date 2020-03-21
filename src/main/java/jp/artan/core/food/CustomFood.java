package jp.artan.core.food;

import jp.artan.core.event.IItemRegisterEvent;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;

/**
 * 食べ物の共通クラス
 * @apiNote
 * ./lang/en_us.lang　言語設定
 *      item.${name}.name=XXXXX
 * ./lang/ja_JP.lang　言語設定
 *      item.${name}.name=XXXXX
 * ./models/item/${name}.json
 *      アイテムのテクスチャ情報を記述
 * ./textures/item/${name}.png
 *      アイテムのテクスチャ情報を記述
 */
public abstract class CustomFood extends ItemFood implements IItemRegisterEvent {
    protected final String name;

    public CustomFood(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.name = name;
        this.setUnlocalizedName(this.name);
    }

    @Override
    public void registerItem(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(this);
    }

    /**
     * モデルを登録する
     *
     * @param event
     */
    @Override
    public void registerModel(String modId, ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(this, 0,
                new ModelResourceLocation(new ResourceLocation(modId, this.name), "inventory"));
    }
}

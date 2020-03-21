package jp.artan.core.event;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;

public interface IItemRegisterEvent {

    /**
     * アイテムを登録
     *
     * @param event
     */
    void registerItem(RegistryEvent.Register<Item> event);

    /**
     * モデルを登録
     *
     * @param event
     */
    void registerModel(String modId, ModelRegistryEvent event);
}

package jp.artan.core.crop;

import jp.artan.core.food.CustomFoodAsSeed;
import jp.artan.core.food.CustomPlant;

public abstract class CustomSameCropAsSeed {

    public final CustomPlant plant;

    public final CustomFoodAsSeed seed;

    /**
     * コンストラクタ
     * 
     * @param seed 種
     */
    public CustomSameCropAsSeed(CustomFoodAsSeed seed) {
        this.seed = seed;
        this.plant = this.seed.plant;
    }
}

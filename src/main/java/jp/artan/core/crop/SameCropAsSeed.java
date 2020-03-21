package jp.artan.core.crop;

import jp.artan.core.food.CustomFoodAsSeed;
import jp.artan.core.food.CustomPlant;

public abstract class SameCropAsSeed {

    public final CustomPlant plant;

    public final CustomFoodAsSeed seed;

    /**
     * コンストラクタ
     * 
     * @param seed 種
     */
    public SameCropAsSeed(CustomFoodAsSeed seed) {
        this.seed = seed;
        this.plant = this.seed.plant;
    }
}

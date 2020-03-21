package jp.artan.core.crop;

import jp.artan.core.food.CustomFood;
import jp.artan.core.food.CustomPlant;
import jp.artan.core.food.CustomSeed;

public abstract class CropsWithSeeds {

    public final CustomPlant plant;

    public final CustomSeed seed;

    public final CustomFood food;

    /**
     * コンストラクタ
     * 
     * @param seed 種
     */
    public CropsWithSeeds(CustomFood food, CustomSeed seed) {
        this.food = food;
        this.seed = seed;
        this.plant = this.seed.plant;
    }
}

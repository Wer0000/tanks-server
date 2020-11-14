package gtanks.battles.tanks.weapons.flamethrower;

import gtanks.battles.tanks.weapons.EntityType;
import gtanks.battles.tanks.weapons.IEntity;
import gtanks.battles.tanks.weapons.ShotData;

public class FlamethrowerEntity implements IEntity {
    public final EntityType type;
    public int targetDetectionInterval;
    public float range;
    public float coneAngle;
    public int heatingSpeed;
    public int coolingSpeed;
    public int heatLimit;
    public float damage_min;
    public float damage_max;
    public ShotData shotData;

    public FlamethrowerEntity(int targetDetectionInterval, float range, float coneAngle, int heatingSpeed, int coolingSpeed, int heatLimit, ShotData shotData, float damageMax, float damageMin) {
        this.type = EntityType.FLAMETHROWER;
        this.targetDetectionInterval = targetDetectionInterval;
        this.range = range;
        this.coneAngle = coneAngle;
        this.heatingSpeed = heatingSpeed;
        this.coolingSpeed = coolingSpeed;
        this.heatLimit = heatLimit;
        this.shotData = shotData;
        this.damage_min = damageMin;
        this.damage_max = damageMax;
    }

    @Override
    public ShotData getShotData() {
        return this.shotData;
    }

    @Override
    public EntityType getType() {
        return this.type;
    }
}

package gtanks.battles.tanks.colormaps;

import gtanks.users.garage.enums.PropertyType;

import java.util.HashMap;
import java.util.Map;

public class ColormapsFactory {
    private static Map<String, Colormap> colormaps = new HashMap<>();

    public static void addColormap(String id, Colormap colormap) {
        colormaps.put(id, colormap);
    }

    public static Colormap getColormap(String id) {
        return colormaps.get(id);
    }

    public static ColormapResistanceType getResistanceType(PropertyType pType) {
        ColormapResistanceType type = null;
        switch (pType) {
            case MECH_RESISTANCE:
                type = ColormapResistanceType.SMOKY;
                break;
            case PLASMA_RESISTANCE:
                type = ColormapResistanceType.TWINS;
                break;
            case RAIL_RESISTANCE:
                type = ColormapResistanceType.RAILGUN;
                break;
            case VAMPIRE_RATE:
                type = ColormapResistanceType.ISIDA;
            case ARMOR:
            case TURRET_TURN_SPEED:
            default:
                break;
            case FIRE_RESISTANCE:
                type = ColormapResistanceType.FLAMETHROWER;
                break;
            case THUNDER_RESISTANCE:
                type = ColormapResistanceType.THUNDER;
                break;
            case FREEZE_RESISTANCE:
                type = ColormapResistanceType.FREZEE;
                break;
            case RICOCHET_RESISTANCE:
                type = ColormapResistanceType.RICOCHET;
        }

        return type;
    }

}

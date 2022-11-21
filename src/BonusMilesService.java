public class BonusMilesService {
    public int calculate(int cost) {
        int bonusMile = 20;
        int milesModernization = cost / bonusMile;
        return milesModernization;
    }
}
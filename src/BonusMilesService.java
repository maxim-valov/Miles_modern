public class BonusMilesService {
        public int calculate(int price) {
            int bid = 20;
            int miles;
            miles = price / bid;
            return miles;
        }
    }
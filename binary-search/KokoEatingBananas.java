class KokoEatingBananas{
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > high) {
                high = piles[i];
            }
        }

        int best = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long total = 0;
            for (int pile : piles) {
                long timeTakenToFinishPile = pile / mid;
                if (pile % mid > 0) {
                    timeTakenToFinishPile++;
                }
                total += timeTakenToFinishPile;
            }

            if (total > h) {
                low = mid + 1;
            } else {
                best = mid;
                high = mid - 1;
            }
        }

        return best;
    }
}
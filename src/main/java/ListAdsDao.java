import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {
    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
                1,
                1,
                "ad 1",
                "desc 1"
        ));
        ads.add(new Ad(
                2,
                1,
                "ad 2",
                "desc 2"
        ));
        ads.add(new Ad(
                3,
                2,
                "ad 3",
                "desc 3"
        ));
        ads.add(new Ad(
                4,
                2,
                "ad 4",
                "desc 4"
        ));
        return ads;
    }
}
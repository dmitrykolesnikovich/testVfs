package featurea.mario.android;

import featurea.android.FeatureaActivity;
import featurea.app.Application;

public class MainActivity extends FeatureaActivity {

    @Override
    public void onCreateApplication(Application app) {
        super.onCreateApplication(app);
        mario.Main.main(new String[]{});
    }

}

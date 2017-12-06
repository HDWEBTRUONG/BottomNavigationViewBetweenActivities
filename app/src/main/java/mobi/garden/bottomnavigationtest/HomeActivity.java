package mobi.garden.bottomnavigationtest;

import android.view.View;
import android.widget.Toast;

public class HomeActivity extends BaseActivity {


    @Override
    int getContentViewId() {
        return R.layout.activity_home;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_home;
    }


}

package cn.anline.annzone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import cn.anline.annzone.ui.*
import com.gyf.barlibrary.ImmersionBar
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 主界面
 */
class MainActivity : AppCompatActivity() {

    lateinit var fragmentMutableList: MutableList<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ImmersionBar.with(this)
                .transparentStatusBar()
                .navigationBarColor(R.color.colorTabbar)
                .init()
        setContentView(R.layout.activity_main)
//        添加Fragment
        fragmentMutableList = ArrayList<Fragment>()
        fragmentMutableList.add(DiscoverFragment())
        fragmentMutableList.add(ProjectFragment())
        fragmentMutableList.add(PublishFragment())
        fragmentMutableList.add(WorkFragment())
        fragmentMutableList.add(MeFragment())

        spaceTabLayout.initialize(viewPager,supportFragmentManager,fragmentMutableList,savedInstanceState)
        spaceTabLayout.setTabOneIcon(R.mipmap.tabbar_discover)
        spaceTabLayout.setTabTwoIcon(R.mipmap.tabbar_project)
        spaceTabLayout.setTabThreeIcon(R.mipmap.tabbar_publish)
        spaceTabLayout.setTabFourIcon(R.mipmap.tabbar_work)
        spaceTabLayout.setTabFiveIcon(R.mipmap.tabbar_me)
    }
}

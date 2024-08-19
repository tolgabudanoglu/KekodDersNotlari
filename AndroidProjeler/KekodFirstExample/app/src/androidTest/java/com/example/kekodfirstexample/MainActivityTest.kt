package com.example.kekodfirstexample

import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Test
    fun textActivities1(){
        launchActivity<MainActivity>().use { scenario ->
            scenario.moveToState(Lifecycle.State.RESUMED)
        }
    }

    @Test
    fun textActivities2(){
        launchActivity<MainActivity>().use { scenario ->
            scenario.recreate()
        }
    }
    @Test
    fun textActivities3(){
        launchActivity<MainActivity>().use { scenario ->
            scenario.onActivity { activity ->
                val intent = Intent(activity,SettingsActivity::class.java)
                startActivity(activity,intent,null)

            }
        }
    }
    @Test
    fun textActivities4(){
        launchActivity<MainActivity>().use { scenario ->
            onView(withId(R.id.buttonNext)).perform(click())
        }
    }
    @Test
    fun textActivities5(){
        launchActivity<MainActivity>().use { scenario ->
            scenario.onActivity { activity ->
                activity.someBusinesLogic("T","A")
            }
        }
    }
}

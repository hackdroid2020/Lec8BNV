package edu.tomerbu.lec8bnv.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


//ViewModel: digest the model for the Controller
//use the model => represent it for the UI.
//examples: colors according to state
//example: date String from date
//expose LiveData for the controller
public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
package com.pratik.medicinetime.alarm;

import com.pratik.medicinetime.BasePresenter;
import com.pratik.medicinetime.BaseView;
import com.pratik.medicinetime.data.source.History;
import com.pratik.medicinetime.data.source.MedicineAlarm;

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}

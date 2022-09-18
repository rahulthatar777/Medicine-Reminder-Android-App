package com.pratik.medicinetime.addmedicine;

import com.pratik.medicinetime.BasePresenter;
import com.pratik.medicinetime.BaseView;
import com.pratik.medicinetime.data.source.MedicineAlarm;
import com.pratik.medicinetime.data.source.Pills;

import java.util.List;

public interface AddMedicineContract {

    interface View extends BaseView<Presenter> {

        void showEmptyMedicineError();

        void showMedicineList();

        boolean isActive();

    }

    interface  Presenter extends BasePresenter{


        void saveMedicine(MedicineAlarm alarm, Pills pills);


        boolean isDataMissing();

        boolean isMedicineExits(String pillName);

        long addPills(Pills pills);

        Pills getPillsByName(String pillName);

        List<MedicineAlarm> getMedicineByPillName(String pillName);

        List<Long> tempIds();

        void deleteMedicineAlarm(long alarmId);

    }
}

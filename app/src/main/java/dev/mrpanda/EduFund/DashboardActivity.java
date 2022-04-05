package dev.mrpanda.EduFund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    ListView schoolList;
    SchoolCampaign[] schoolCampaignList;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        schoolCampaignList = new SchoolCampaign[3];
        schoolCampaignList[0] = new SchoolCampaign("MEF University", R.drawable.asd,"dşfkjsdşkfjsdkfjdslkfjsdlkfjlsdkfjsldkfjsdlkfj","123");
        schoolCampaignList[1] = new SchoolCampaign("MEF University", R.drawable.asd,"dşfkjsdşkfjsdkfjdslkfjsdlkfjlsdkfjsldkfjsdlkfj","123");
        schoolCampaignList[2] = new SchoolCampaign("MEF University", R.drawable.asd,"dşfkjsdşkfjsdkfjdslkfjsdlkfjlsdkfjsldkfjsdlkfj","123");
        schoolList = findViewById(R.id.dashboard_list);

        SchoolListAdapter adapter = new SchoolListAdapter(this, R.layout.custom_list_item, schoolCampaignList);
        schoolList.setAdapter(adapter);
        schoolList.setNestedScrollingEnabled(false);
        schoolList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                CallDetail();

            }
        });
    }

    public void CallDetail()
    {
        Intent intent = new Intent(this, CampaignDetailPage.class);
        startActivity(intent);
    }


}
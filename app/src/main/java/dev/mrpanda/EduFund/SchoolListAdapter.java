package dev.mrpanda.EduFund;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;




public class SchoolListAdapter extends ArrayAdapter <SchoolCampaign> {

    private SchoolCampaign[] schoolCampaignList;
    private int resource;

    public SchoolListAdapter(Context context, int resource, SchoolCampaign[] schoolCampaignList) {
        super(context, resource, schoolCampaignList);
        this.resource = resource;
        this.schoolCampaignList = schoolCampaignList;
    }


    @SuppressLint("ResourceAsColor")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View satir;
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        satir = layoutInflater.inflate(resource,null);


        SchoolCampaign transaction = schoolCampaignList[position];

        ImageView list_item_image = satir.findViewById(R.id.list_item_image);
        TextView list_item_title = satir.findViewById(R.id.list_item_school_name);
        TextView list_item_desc = satir.findViewById(R.id.list_item_school_description);

        list_item_desc.setText(transaction.schoolDescription);
        list_item_title.setText(transaction.schoolName);
        list_item_image.setImageResource(transaction.schoolImage);
       return satir;



    }

}

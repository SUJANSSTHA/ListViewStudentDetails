package com.example.listviewstudentdetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class StudentAdapter extends ArrayAdapter<Student> {


    public StudentAdapter(Context context, List<Student> students) {
        super(context,0,students);
    }

    //    @NonNull
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        //Gt the data item fro this position
        Student student = getItem(position);
        //Check if an existing view is being reused, otherwise inflate the view
        if(convertView == null){
//            convertView = LayoutInflater.from((getContext()))
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        //looking view for data population

        TextView studentId = convertView.findViewById(R.id.id);
        TextView studentName = convertView.findViewById(R.id.stdName);
        TextView studentAddress = convertView.findViewById(R.id.stdAddress);
        

        return convertView;
    }
}

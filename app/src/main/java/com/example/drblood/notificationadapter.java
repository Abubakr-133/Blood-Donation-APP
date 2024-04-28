package com.example.drblood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class notificationadapter extends RecyclerView.Adapter<notificationadapter.ViewHolder> {

    private List<acceptedrequest> requestList;

    public notificationadapter(List<acceptedrequest> requestList) {

        this.requestList = requestList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_notificationcardview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        acceptedrequest request = requestList.get(position);
        holder.bind(request);
    }

    @Override
    public int getItemCount() {

        return requestList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView DonorName, DonorPhno, PatientName, PatientPhno;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            DonorName = itemView.findViewById(R.id.notidonorname_text);
            DonorPhno = itemView.findViewById(R.id.notidonorphno_text);
            PatientName = itemView.findViewById(R.id.notipatientname_text);
            PatientPhno = itemView.findViewById(R.id.notipatientphno);
            
        }

        public void bind(acceptedrequest request) {
            DonorName.setText(request.getDonorName());
            DonorPhno.setText(request.getDonorPhno());
            PatientName.setText(request.getPatientname());
            PatientPhno.setText(request.getPatientphno());
        }
    }
}

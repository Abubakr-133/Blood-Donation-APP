package com.example.drblood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class historyadapter extends RecyclerView.Adapter<historyadapter.ViewHolder> {

    private List<acceptedrequest> requestList;

    public historyadapter(List<acceptedrequest> requestList) {

        this.requestList = requestList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_history, parent, false);
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
        TextView DonorName,Bloodgroup, PatientName, location;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            DonorName = itemView.findViewById(R.id.donorname_text);
            Bloodgroup = itemView.findViewById(R.id.bloodgroup_text);
            PatientName = itemView.findViewById(R.id.patientnameh_text);
            location= itemView.findViewById(R.id.donationplace_text);

        }

        public void bind(acceptedrequest request) {
            DonorName.setText(request.getDonorName());
            Bloodgroup.setText(request.getBloodgroup());
            PatientName.setText(request.getPatientname());
            location.setText(request.getAddress());
        }

    }
}
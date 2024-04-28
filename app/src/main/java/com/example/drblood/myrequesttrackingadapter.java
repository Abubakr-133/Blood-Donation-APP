package com.example.drblood;

import static android.app.ProgressDialog.show;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class myrequesttrackingadapter extends RecyclerView.Adapter<myrequesttrackingadapter.ViewHolder> {

    private List<acceptedrequest> requestList;

    public myrequesttrackingadapter(List<acceptedrequest> requestList,Context context) {
        this.mContext=context;
        this.requestList = requestList;
    }
    private static Context mContext;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_requesttracking, parent, false);
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
        TextView DonorName, DonorPhno, PatientName,  Bloodgroup;
        Button Donationconfirmed,donationcancelled;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            DonorName = itemView.findViewById(R.id.donornamemr_text);
            DonorPhno = itemView.findViewById(R.id.Donorphno_text);
            PatientName = itemView.findViewById(R.id.patientnamemr_text);
            Bloodgroup= itemView.findViewById(R.id.bloodgroupmr_text);
            Donationconfirmed=itemView.findViewById(R.id.donationcomplete_button);
            donationcancelled=itemView.findViewById(R.id.donationcancelled_text);

        }

        public void bind(acceptedrequest request) {
            DonorName.setText(request.getDonorName());
            DonorPhno.setText(request.getDonorPhno());
            PatientName.setText(request.getPatientname());
            Bloodgroup.setText(request.getBloodgroup());
            Donationconfirmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        relocatecardview(request);
                        Toast.makeText(mContext,"Donation Completed!",Toast.LENGTH_SHORT).show();
                        Navigation.findNavController(v).navigate(R.id.action_myRequestFragment_to_mainActivity);




            }
        });
            donationcancelled.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "donation Cancelled!", Toast.LENGTH_SHORT).show();

                    FirebaseDatabase.getInstance().getReference("AcceptedRequests").child(request.Patientid).removeValue();
                }
            });
    }
    private void relocatecardview(acceptedrequest patientdata){
            FirebaseDatabase.getInstance().getReference("History").child(patientdata.Patientid).setValue(patientdata);

        // Delete the root node
        FirebaseDatabase.getInstance().getReference("AcceptedRequests").child(patientdata.Patientid).removeValue();
    }


    }
}
package com.example.sqlitecurd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactDM> arrContact;

    public ContactAdapter(Context context, ArrayList<ContactDM> arrContact) {
        this.context = context;
        this.arrContact = arrContact;
    }

    @NonNull
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.contactlistitem,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder, int position) {
        holder.userName.setText(arrContact.get(position).name);
        holder.userEmail.setText(arrContact.get(position).email);
        holder.userPhone.setText(arrContact.get(position).phone);
        holder.userAddress.setText(arrContact.get(position).address);
    }

    @Override
    public int getItemCount() {
        return arrContact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView userName,userEmail,userPhone,userAddress;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userName=itemView.findViewById(R.id.itemUserName);
            userEmail=itemView.findViewById(R.id.itemUserEmail);
            userPhone=itemView.findViewById(R.id.itemUserPhone);
            userAddress=itemView.findViewById(R.id.itemUserAddress);

        }
    }
}

package vn.e.materialdesignp2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class MyHolder extends RecyclerView.ViewHolder {


    public TextView tvName,tvAddress;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.tvName);

        tvAddress = itemView.findViewById(R.id.tvAddress);


    }



}

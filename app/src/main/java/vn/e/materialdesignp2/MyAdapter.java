package vn.e.materialdesignp2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {


    private Context context;
    private List<Student> students;


    public MyAdapter(Context context, List<Student> students) {
        this.students = students;
        this.context = context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.item, viewGroup, false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, final int i) {

        myHolder.tvName.setText(students.get(i).name);
        myHolder.tvAddress.setText(students.get(i).address);

        myHolder.tvAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Student student = students.get(i);

                student.name = "ABC";
                student.address = "CBA";

                notifyDataSetChanged();

            }
        });

        myHolder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                students.remove(i);

                notifyItemRemoved(i);

            }
        });

    }

    @Override
    public int getItemCount() {

        if (students == null) return 0;
        else
            return students.size();

    }
}

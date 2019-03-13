package com.example.prashant.mela_money;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.List;

class Madapter extends RecyclerView.Adapter<Madapter.Viewholder> {
private List<Mevent> meventList;
private Context context;
public static String event_Name;


    public Madapter(List<Mevent> meventList) {
      this.meventList=meventList;

    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list,viewGroup,false);

        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Viewholder viewholder, final int i) {
Mevent mevent=meventList.get(i);
viewholder.title.setText(mevent.getTitle());
viewholder.description.setText(mevent.getDescription());
viewholder.amount.setText(mevent.getAmount());
viewholder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent intent = new Intent(context, EventActivity.class);
        switch (i)
        {

            case 0:
                event_Name = "Error finding";
                context.startActivity(intent);
                break;
            case 1:
                event_Name = "Faalakura";
                context.startActivity(intent);
                break;
            case 2:
                event_Name = "Inside out";
                context.startActivity(intent);
                break;
            case 3:
                event_Name = "Kotmeer";
                context.startActivity(intent);
                break;
            case 4:
                event_Name = "Karepak";
                context.startActivity(intent);
                break;
            case 5:
                event_Name = "Pudina";
                context.startActivity(intent);
                break;
            case 6:
                event_Name = "Pappu";
                context.startActivity(intent);
                break;
            case 7:
                event_Name = "Sambar";
                context.startActivity(intent);
                break;
            case 8:
                event_Name = "Mela ";
                context.startActivity(intent);
                break;
            case 9:
                event_Name = "IEEE fasak";
                context.startActivity(intent);
                break;

        }


    }
});

    }

    @Override
    public int getItemCount() {
        return meventList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView title,description,amount;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            context=itemView.getContext();
            title=itemView.findViewById(R.id.title);
            description=itemView.findViewById(R.id.description);
            amount=itemView.findViewById(R.id.amount);


        }
    }
}

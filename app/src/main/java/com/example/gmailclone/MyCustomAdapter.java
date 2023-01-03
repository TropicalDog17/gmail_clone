package com.example.gmailclone;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.ViewHolder>{
    private EmailModel[] emails;
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView tvSubject, tvTime, tvContentPreview;
        private final CheckBox cbStar;

        public ViewHolder(View view){
            super(view);

            tvSubject = (TextView) view.findViewById(R.id.email_subject);
            tvTime = (TextView) view.findViewById(R.id.time);
            tvContentPreview = (TextView) view.findViewById(R.id.content_preview);
            cbStar = (CheckBox) view.findViewById(R.id.star);
        }
        public TextView getTvSubject(){
            return tvSubject;
        }
        public TextView getTvTime(){
            return tvTime;
        }

        public TextView getTvContentPreview() {
            return tvContentPreview;
        }
        public CheckBox getCbStar(){
            return cbStar;
        }
    }
    public MyCustomAdapter(EmailModel[] models) {
        emails = models;
    }
    @NonNull
    @Override
    public MyCustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomAdapter.ViewHolder holder, int position) {
        holder.getTvSubject().setText(emails[position].title);
        holder.getTvContentPreview().setText(emails[position].preview);
        holder.getTvTime().setText(emails[position].time);
        holder.getCbStar().setEnabled(emails[position].isStarred);
    }

    @Override
    public int getItemCount() {
        return emails.length;
    }
}

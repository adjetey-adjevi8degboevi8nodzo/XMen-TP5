package fr.ucaolan.xmen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fr.ucaolan.xmen.databinding.XMenBinding;

public class XMenAdapter extends RecyclerView.Adapter<XMenViewHolder> {
    Context context;
    List<XMen> list;

    private  XMenAdapter.OnItemClickListener onItemClickListener;

    public XMenAdapter(List<XMen> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public XMenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        XMenBinding ui = XMenBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        );

        return new XMenViewHolder(ui);
    }

    @Override
    public void onBindViewHolder(@NonNull XMenViewHolder holder, int position) {
        holder.setXMen(list.get(position));
        holder.setOnItemClickListener(onItemClickListener);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
}

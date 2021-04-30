package com.rudransh.restandstore.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rudransh.restandstore.Interface.ItemClickListner;
import com.rudransh.restandstore.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{

    public TextView txtProductName, txtProductDescription, txtProductPrice;
    public ImageView imageView;
    public ItemClickListner listner;

    public ProductViewHolder(@NonNull View itemView)
    {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.product_item_image);
        txtProductName = (TextView) itemView.findViewById(R.id.product_item_name);
        txtProductDescription = (TextView) itemView.findViewById(R.id.product_item_description);
        txtProductPrice = (TextView) itemView.findViewById(R.id.product_item_price);
    }

    public void setItemClickListner(ItemClickListner listner)
    {
        this.listner = listner;
    }

    @Override
    public void onClick(View view)
    {
        listner.onClick(view, getAdapterPosition(), false);
    }
}

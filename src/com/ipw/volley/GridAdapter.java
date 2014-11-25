package com.ipw.volley;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
   
	Context mContext;
	ImageLoader mLoader;
	ImageView mImageView;
	LayoutInflater mInflater;
	
	public GridAdapter(Context context){
		
		this.mContext = context;
		mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    mLoader = MySingleton.getInstance(mContext).getImageLoader();
		
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return DataResource.URLS.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
	
       if(convertView == null){
			
			convertView = mInflater.inflate(R.layout.grid_item,null);
		}
		
		NetworkImageView mNetworkImageView = (NetworkImageView) convertView.findViewById(R.id.network_image_grid_view);
		
		mNetworkImageView.setDefaultImageResId(R.drawable.home);
		mNetworkImageView.setImageUrl(DataResource.URLS[position],mLoader);
		
		return convertView;
	}

}

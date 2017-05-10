package com.bihe0832.android.optimize;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	private int clickTimes = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {

		final TextView icon1 = (TextView) findViewById(R.id.icon1);
		icon1.setTypeface(FontManager.getTypeface(this));
		icon1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				clickTimes ++;
				switch (clickTimes % 3){
					case 0:
						icon1.setTextColor(getResources().getColor(R.color.icon_color_default));
						icon1.setTextSize(getResources().getDimension(R.dimen.icon_size_default));
						break;
					case 1:
						icon1.setTextColor(getResources().getColor(R.color.icon_color_1));
						icon1.setTextSize(getResources().getDimension(R.dimen.icon_size_default) * 2);
						break;
					case 2:
						icon1.setTextColor(getResources().getColor(Res.color(getResources(),"icon_color_2",getPackageName())));
						icon1.setTextSize(getResources().getDimension(R.dimen.icon_size_default) * 4);
						break;
				}
			}
		});
	}

}

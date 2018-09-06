package com.example.usuario.camararasberry;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class progress extends Animation{

    private ProgressBar ProgressBar;
    Context context;
    TextView textView;
    float to;
    float from;

    public progress(Context context, ProgressBar progressBar, TextView textView, float to, float from) {
        this.ProgressBar = progressBar;
        this.context = context;
        this.textView = textView;
        this.to = to;
        this.from = from;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float value = from + (to - from) * interpolatedTime;
        ProgressBar.setProgress((int)value);
        textView.setText((int)value+"%");

        if(value == to){

       //context.startActivity(new Intent(context,MainActivity.class));
            Toast.makeText(context,"Conectado",Toast.LENGTH_SHORT).show();

        }



    }
}

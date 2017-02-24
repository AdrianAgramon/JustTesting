package com.example.adrin.location;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.vision.text.Text;

public class FinalPartida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_partida);

        final int scoreFinal = CorrectoActivity.resultado;


        final TextView finalScore = (TextView) findViewById(R.id.resultadoFinal);

        ValueAnimator animator = new ValueAnimator();
        animator.setObjectValues(0, scoreFinal);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator animation) {
                finalScore.setText(String.valueOf(animation.getAnimatedValue()));
            }
        });
        animator.setEvaluator(new TypeEvaluator<Integer>() {
            public Integer evaluate(float fraction, Integer startValue, Integer endValue) {
                return Math.round(startValue + (endValue - startValue) * fraction);
            }
        });
        animator.setDuration(1000);
        animator.start();

        Button end = (Button) findViewById(R.id.buttonEnd);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg = new Intent(FinalPartida.this, selectWhere.class);
             //   reg.putExtra("Score", scoreFinal);
                startActivity(reg);
            }
        });



}
}
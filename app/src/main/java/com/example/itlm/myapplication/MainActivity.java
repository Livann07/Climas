package com.example.itlm.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.zetterstrom.com.forecast.ForecastClient;
import android.zetterstrom.com.forecast.ForecastConfiguration;
import android.zetterstrom.com.forecast.models.Language;
import android.zetterstrom.com.forecast.models.Unit;

public class MainActivity extends AppCompatActivity {

    public final String DarkSkyApiKey="6648b1dd3cc4711d7878643a098a9b34";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ForecastConfiguration configuration=
                new ForecastConfiguration.Builder(DarkSkyApiKey)
                        .setDefaultLanguage(Language.SPANISH)
                        .setDefaultUnit(Unit.SI)
                        .setCacheDirectory(getCacheDir())
                        .build();
        ForecastClient.create(configuration);

    }
}
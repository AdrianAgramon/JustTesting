package com.example.adrin.location;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.util.Random;

public class EuropaPartida extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partida_europa);

        final int score = 0;
        final String ciudad = getIntent().getExtras().getString("Ciudad");
        // score = getIntent().getExtras().getInt("Score");

        final ImageView otra = (ImageView) findViewById(R.id.fotosCiudad);
        final Button resuelvo = (Button) findViewById(R.id.Resulevo);

        int min = 1;
        int max = 8;

        Random r = new Random();
        int number = r.nextInt(max - min + 1) + min;
        final String result = String.valueOf(number);


        if (ciudad.equals("Madrid")) {
            final Bitmap madrid1 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid1);
            final Bitmap madrid2 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid2);
            final Bitmap madrid3 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid3);
            final Bitmap madrid4 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid4);
            final Bitmap madrid5 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid5);
            final Bitmap madrid6 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid6);
            final Bitmap madrid7 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid7);
            final Bitmap madrid8 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid8);


            if (result.equals("1")) {
                otra.setImageBitmap(madrid1);

            } else if (result.equals("2")) {
                otra.setImageBitmap(madrid2);

            } else if (result.equals("3")) {
                otra.setImageBitmap(madrid3);

            } else if (result.equals("4")) {
                otra.setImageBitmap(madrid4);

            } else if (result.equals("5")) {
                otra.setImageBitmap(madrid5);

            } else if (result.equals("6")) {
                otra.setImageBitmap(madrid6);

            } else if (result.equals("7")) {
                otra.setImageBitmap(madrid7);

            } else if (result.equals("8")) {
                otra.setImageBitmap(madrid8);

            } else {
                System.out.println("ERROR");
            }


            otra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int min = 1;
                    int max = 8;

                    Random r = new Random();
                    int number = r.nextInt(max - min + 1) + min;
                    final String result = String.valueOf(number);


                    if (result.equals("1")) {
                        otra.setImageBitmap(madrid1);

                    } else if (result.equals("2")) {
                        otra.setImageBitmap(madrid2);

                    } else if (result.equals("3")) {
                        otra.setImageBitmap(madrid3);

                    } else if (result.equals("4")) {
                        otra.setImageBitmap(madrid4);

                    } else if (result.equals("5")) {
                        otra.setImageBitmap(madrid5);

                    } else if (result.equals("6")) {
                        otra.setImageBitmap(madrid6);

                    } else if (result.equals("7")) {
                        otra.setImageBitmap(madrid7);

                    } else if (result.equals("8")) {
                        otra.setImageBitmap(madrid8);

                    } else {
                        System.out.println("ERROR");
                    }

                }
            });

            final double[] coord2 = new double[]{40.2459, -3.4209};

            resuelvo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                    reg.putExtra("Score", score);
                    reg.putExtra("coord", coord2);
                    startActivity(reg);


                }
            });

        } else if (ciudad.equals("Berlin")) {
            // case "Berlin":


            final Bitmap berlin1 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber1);
            final Bitmap berlin2 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber2);
            final Bitmap berlin3 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber3);
            final Bitmap berlin4 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber4);
            final Bitmap berlin5 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber5);
            final Bitmap berlin6 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber6);
            final Bitmap berlin7 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber7);
            final Bitmap berlin8 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber8);

            if (result.equals("1")) {
                otra.setImageBitmap(berlin1);

            } else if (result.equals("2")) {
                otra.setImageBitmap(berlin2);

            } else if (result.equals("3")) {
                otra.setImageBitmap(berlin3);

            } else if (result.equals("4")) {
                otra.setImageBitmap(berlin4);

            } else if (result.equals("5")) {
                otra.setImageBitmap(berlin5);

            } else if (result.equals("6")) {
                otra.setImageBitmap(berlin6);

            } else if (result.equals("7")) {
                otra.setImageBitmap(berlin7);

            } else if (result.equals("8")) {
                otra.setImageBitmap(berlin8);

            } else {
                System.out.println("ERROR");
            }

            otra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int min = 1;
                    int max = 8;

                    Random r = new Random();
                    int number = r.nextInt(max - min + 1) + min;
                    final String result = String.valueOf(number);


                    if (result.equals("1")) {
                        otra.setImageBitmap(berlin1);

                    } else if (result.equals("2")) {
                        otra.setImageBitmap(berlin2);

                    } else if (result.equals("3")) {
                        otra.setImageBitmap(berlin3);

                    } else if (result.equals("4")) {
                        otra.setImageBitmap(berlin4);

                    } else if (result.equals("5")) {
                        otra.setImageBitmap(berlin5);

                    } else if (result.equals("6")) {
                        otra.setImageBitmap(berlin6);

                    } else if (result.equals("7")) {
                        otra.setImageBitmap(berlin7);

                    } else if (result.equals("8")) {
                        otra.setImageBitmap(berlin8);

                    } else {
                        System.out.println("ERROR");
                    }
                }
            });

            final double[] coord3 = new double[]{52.5243700, 13.4105300};
            resuelvo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                    reg.putExtra("Score", score);
                    reg.putExtra("coord", coord3);
                    startActivity(reg);


                }
            });


        } else if (ciudad.equals("Basilea")) {

            final Bitmap basel1 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel1);
            final Bitmap basel2 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel2);
            final Bitmap basel3 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel3);
            final Bitmap basel4 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel4);
            final Bitmap basel5 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel5);
            final Bitmap basel6 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel6);
            final Bitmap basel7 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel7);
            final Bitmap basel8 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel8);


            if (result.equals("1")) {
                otra.setImageBitmap(basel1);

            } else if (result.equals("2")) {
                otra.setImageBitmap(basel2);

            } else if (result.equals("3")) {
                otra.setImageBitmap(basel3);

            } else if (result.equals("4")) {
                otra.setImageBitmap(basel4);

            } else if (result.equals("5")) {
                otra.setImageBitmap(basel5);

            } else if (result.equals("6")) {
                otra.setImageBitmap(basel6);

            } else if (result.equals("7")) {
                otra.setImageBitmap(basel7);

            } else if (result.equals("8")) {
                otra.setImageBitmap(basel8);

            } else {
                System.out.println("ERROR");
            }


            otra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int min = 1;
                    int max = 8;

                    Random r = new Random();
                    int number = r.nextInt(max - min + 1) + min;
                    final String result = String.valueOf(number);

                    if (result.equals("1")) {
                        otra.setImageBitmap(basel1);

                    } else if (result.equals("2")) {
                        otra.setImageBitmap(basel2);

                    } else if (result.equals("3")) {
                        otra.setImageBitmap(basel3);

                    } else if (result.equals("4")) {
                        otra.setImageBitmap(basel4);

                    } else if (result.equals("5")) {
                        otra.setImageBitmap(basel5);

                    } else if (result.equals("6")) {
                        otra.setImageBitmap(basel6);

                    } else if (result.equals("7")) {
                        otra.setImageBitmap(basel7);

                    } else if (result.equals("8")) {
                        otra.setImageBitmap(basel8);

                    } else {
                        System.out.println("ERROR");
                    }

                }
            });


            final double[] coord3 = new double[]{47.5583900, 7.5732700};
            resuelvo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                    reg.putExtra("Score", score);
                    reg.putExtra("coord", coord3);
                    startActivity(reg);


                }
            });

        } else if (ciudad.equals("Barcelona")) {


            final Bitmap barcelona1 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar1);
            final Bitmap barcelona2 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar2);
            final Bitmap barcelona3 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar3);
            final Bitmap barcelona4 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar4);
            final Bitmap barcelona5 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar5);
            final Bitmap barcelona6 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar6);
            final Bitmap barcelona7 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar7);
            final Bitmap barcelona8 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar8);


            if (result.equals("1")) {
                otra.setImageBitmap(barcelona1);

            } else if (result.equals("2")) {
                otra.setImageBitmap(barcelona2);

            } else if (result.equals("3")) {
                otra.setImageBitmap(barcelona3);

            } else if (result.equals("4")) {
                otra.setImageBitmap(barcelona4);

            } else if (result.equals("5")) {
                otra.setImageBitmap(barcelona5);

            } else if (result.equals("6")) {
                otra.setImageBitmap(barcelona6);

            } else if (result.equals("7")) {
                otra.setImageBitmap(barcelona7);

            } else if (result.equals("8")) {
                otra.setImageBitmap(barcelona8);

            } else {
                System.out.println("ERROR");
            }


            otra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int min = 1;
                    int max = 8;

                    Random r = new Random();
                    int number = r.nextInt(max - min + 1) + min;
                    final String result = String.valueOf(number);


                    if (result.equals("1")) {
                        otra.setImageBitmap(barcelona1);

                    } else if (result.equals("2")) {
                        otra.setImageBitmap(barcelona2);

                    } else if (result.equals("3")) {
                        otra.setImageBitmap(barcelona3);

                    } else if (result.equals("4")) {
                        otra.setImageBitmap(barcelona4);

                    } else if (result.equals("5")) {
                        otra.setImageBitmap(barcelona5);

                    } else if (result.equals("6")) {
                        otra.setImageBitmap(barcelona6);

                    } else if (result.equals("7")) {
                        otra.setImageBitmap(barcelona7);

                    } else if (result.equals("8")) {
                        otra.setImageBitmap(barcelona8);

                    } else {
                        System.out.println("ERROR");
                    }
                }
            });


            final double[] coord3 = new double[]{41.3887900, 2.1589900};
            resuelvo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                    reg.putExtra("Score", score);
                    reg.putExtra("coord", coord3);
                    startActivity(reg);


                }
            });


        } else if (ciudad.equals("Dublin")) {

            final Bitmap dublin1 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub1);
            final Bitmap dublin2 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub2);
            final Bitmap dublin3 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub3);
            final Bitmap dublin4 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub4);
            final Bitmap dublin5 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub5);
            final Bitmap dublin6 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub6);
            final Bitmap dublin7 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub7);
            final Bitmap dublin8 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub8);


            if (result.equals("1")) {
                otra.setImageBitmap(dublin1);

            } else if (result.equals("2")) {
                otra.setImageBitmap(dublin2);

            } else if (result.equals("3")) {
                otra.setImageBitmap(dublin3);

            } else if (result.equals("4")) {
                otra.setImageBitmap(dublin4);

            } else if (result.equals("5")) {
                otra.setImageBitmap(dublin5);

            } else if (result.equals("6")) {
                otra.setImageBitmap(dublin6);

            } else if (result.equals("7")) {
                otra.setImageBitmap(dublin7);

            } else if (result.equals("8")) {
                otra.setImageBitmap(dublin8);

            } else {
                System.out.println("ERROR");
            }


            otra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int min = 1;
                    int max = 8;

                    Random r = new Random();
                    int number = r.nextInt(max - min + 1) + min;
                    final String result = String.valueOf(number);


                    if (result.equals("1")) {
                        otra.setImageBitmap(dublin1);

                    } else if (result.equals("2")) {
                        otra.setImageBitmap(dublin2);

                    } else if (result.equals("3")) {
                        otra.setImageBitmap(dublin3);

                    } else if (result.equals("4")) {
                        otra.setImageBitmap(dublin4);

                    } else if (result.equals("5")) {
                        otra.setImageBitmap(dublin5);

                    } else if (result.equals("6")) {
                        otra.setImageBitmap(dublin6);

                    } else if (result.equals("7")) {
                        otra.setImageBitmap(dublin7);

                    } else if (result.equals("8")) {
                        otra.setImageBitmap(dublin8);

                    } else {
                        System.out.println("ERROR");
                    }

                }
            });


            final double[] coord3 = new double[]{53.3330600, -6.2488900};
            resuelvo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                    reg.putExtra("Score", score);
                    reg.putExtra("coord", coord3);
                    startActivity(reg);


                }
            });

        } else if (ciudad.equals("Londres")) {

            final Bitmap london1 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon1);
            final Bitmap london2 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon2);
            final Bitmap london3 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon3);
            final Bitmap london4 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon4);
            final Bitmap london5 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon5);
            final Bitmap london6 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon6);
            final Bitmap london7 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon7);
            final Bitmap london8 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon8);


            if (result.equals("1")) {
                otra.setImageBitmap(london1);

            } else if (result.equals("2")) {
                otra.setImageBitmap(london2);

            } else if (result.equals("3")) {
                otra.setImageBitmap(london3);

            } else if (result.equals("4")) {
                otra.setImageBitmap(london4);

            } else if (result.equals("5")) {
                otra.setImageBitmap(london5);

            } else if (result.equals("6")) {
                otra.setImageBitmap(london6);

            } else if (result.equals("7")) {
                otra.setImageBitmap(london7);

            } else if (result.equals("8")) {
                otra.setImageBitmap(london8);

            } else {
                System.out.println("ERROR");
            }

            otra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int min = 1;
                    int max = 8;

                    Random r = new Random();
                    int number = r.nextInt(max - min + 1) + min;
                    final String result = String.valueOf(number);

                    if (result.equals("1")) {
                        otra.setImageBitmap(london1);

                    } else if (result.equals("2")) {
                        otra.setImageBitmap(london2);

                    } else if (result.equals("3")) {
                        otra.setImageBitmap(london3);

                    } else if (result.equals("4")) {
                        otra.setImageBitmap(london4);

                    } else if (result.equals("5")) {
                        otra.setImageBitmap(london5);

                    } else if (result.equals("6")) {
                        otra.setImageBitmap(london6);

                    } else if (result.equals("7")) {
                        otra.setImageBitmap(london7);

                    } else if (result.equals("8")) {
                        otra.setImageBitmap(london8);

                    } else {
                        System.out.println("ERROR");
                    }
                }
            });


            final double[] coord3 = new double[]{51.5085300, -0.1257400};
            resuelvo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                    reg.putExtra("Score", score);
                    reg.putExtra("coord", coord3);
                    startActivity(reg);


                }
            });

        } else if (ciudad.equals("Paris")) {

            final Bitmap paris1 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris1);
            final Bitmap paris2 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris2);
            final Bitmap paris3 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris3);
            final Bitmap paris4 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris4);
            final Bitmap paris5 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris5);
            final Bitmap paris6 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris6);
            final Bitmap paris7 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris7);
            final Bitmap paris8 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris8);
            final Bitmap paris9 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris9);


            if (result.equals("1")) {
                otra.setImageBitmap(paris1);

            } else if (result.equals("2")) {
                otra.setImageBitmap(paris2);

            } else if (result.equals("3")) {
                otra.setImageBitmap(paris3);

            } else if (result.equals("4")) {
                otra.setImageBitmap(paris4);

            } else if (result.equals("5")) {
                otra.setImageBitmap(paris5);

            } else if (result.equals("6")) {
                otra.setImageBitmap(paris6);

            } else if (result.equals("7")) {
                otra.setImageBitmap(paris7);

            } else if (result.equals("8")) {
                otra.setImageBitmap(paris8);

            } else if (result.equals("9")) {
                otra.setImageBitmap(paris9);

            } else {
                System.out.println("ERROR");
            }

            otra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int min = 1;
                    int max = 8;

                    Random r = new Random();
                    int number = r.nextInt(max - min + 1) + min;
                    final String result = String.valueOf(number);


                    if (result.equals("1")) {
                        otra.setImageBitmap(paris1);

                    } else if (result.equals("2")) {
                        otra.setImageBitmap(paris2);

                    } else if (result.equals("3")) {
                        otra.setImageBitmap(paris3);

                    } else if (result.equals("4")) {
                        otra.setImageBitmap(paris4);

                    } else if (result.equals("5")) {
                        otra.setImageBitmap(paris5);

                    } else if (result.equals("6")) {
                        otra.setImageBitmap(paris6);

                    } else if (result.equals("7")) {
                        otra.setImageBitmap(paris7);

                    } else if (result.equals("8")) {
                        otra.setImageBitmap(paris8);

                    } else if (result.equals("9")) {
                        otra.setImageBitmap(paris9);

                    } else {
                        System.out.println("ERROR");
                    }
                }
            });


            final double[] coord3 = new double[]{48.8534100, 2.3488000};
            resuelvo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                    reg.putExtra("Score", score);
                    reg.putExtra("coord", coord3);
                    startActivity(reg);


                }
            });


        } else if (ciudad.equals("Pompeya")) {

            final Bitmap pompeya1 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom1);
            final Bitmap pompeya2 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom2);
            final Bitmap pompeya3 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom3);
            final Bitmap pompeya4 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom4);
            final Bitmap pompeya5 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom5);
            final Bitmap pompeya6 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom6);
            final Bitmap pompeya7 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom7);
            final Bitmap pompeya8 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom8);


            if (result.equals("1")) {
                otra.setImageBitmap(pompeya1);

            } else if (result.equals("2")) {
                otra.setImageBitmap(pompeya2);

            } else if (result.equals("3")) {
                otra.setImageBitmap(pompeya3);

            } else if (result.equals("4")) {
                otra.setImageBitmap(pompeya4);

            } else if (result.equals("5")) {
                otra.setImageBitmap(pompeya5);

            } else if (result.equals("6")) {
                otra.setImageBitmap(pompeya6);

            } else if (result.equals("7")) {
                otra.setImageBitmap(pompeya7);

            } else if (result.equals("8")) {
                otra.setImageBitmap(pompeya8);

            } else {
                System.out.println("ERROR");
            }

            otra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int min = 1;
                    int max = 8;

                    Random r = new Random();
                    int number = r.nextInt(max - min + 1) + min;
                    final String result = String.valueOf(number);

                    if (result.equals("1")) {
                        otra.setImageBitmap(pompeya1);

                    } else if (result.equals("2")) {
                        otra.setImageBitmap(pompeya2);

                    } else if (result.equals("3")) {
                        otra.setImageBitmap(pompeya3);

                    } else if (result.equals("4")) {
                        otra.setImageBitmap(pompeya4);

                    } else if (result.equals("5")) {
                        otra.setImageBitmap(pompeya5);

                    } else if (result.equals("6")) {
                        otra.setImageBitmap(pompeya6);

                    } else if (result.equals("7")) {
                        otra.setImageBitmap(pompeya7);

                    } else if (result.equals("8")) {
                        otra.setImageBitmap(pompeya8);

                    } else {
                        System.out.println("ERROR");
                    }
                }
            });


            final double[] coord3 = new double[]{40.7457400, 14.4969800};
            resuelvo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                    reg.putExtra("Score", score);
                    reg.putExtra("coord", coord3);
                    startActivity(reg);


                }
            });

        } else if (ciudad.equals("Praga")) {

            final Bitmap praga1 = BitmapFactory.decodeResource(getResources(), R.mipmap.pra1);
            final Bitmap praga2 = BitmapFactory.decodeResource(getResources(), R.mipmap.pra2);
            final Bitmap praga3 = BitmapFactory.decodeResource(getResources(), R.mipmap.pra3);
            final Bitmap praga4 = BitmapFactory.decodeResource(getResources(), R.mipmap.pra4);
            final Bitmap praga5 = BitmapFactory.decodeResource(getResources(), R.mipmap.pra5);
            final Bitmap praga6 = BitmapFactory.decodeResource(getResources(), R.mipmap.pra6);
            final Bitmap praga7 = BitmapFactory.decodeResource(getResources(), R.mipmap.pra7);
            final Bitmap praga8 = BitmapFactory.decodeResource(getResources(), R.mipmap.pra8);


            if (result.equals("1")) {
                otra.setImageBitmap(praga1);

            } else if (result.equals("2")) {
                otra.setImageBitmap(praga2);

            } else if (result.equals("3")) {
                otra.setImageBitmap(praga3);

            } else if (result.equals("4")) {
                otra.setImageBitmap(praga4);

            } else if (result.equals("5")) {
                otra.setImageBitmap(praga5);

            } else if (result.equals("6")) {
                otra.setImageBitmap(praga6);

            } else if (result.equals("7")) {
                otra.setImageBitmap(praga7);

            } else if (result.equals("8")) {
                otra.setImageBitmap(praga8);

            } else {
                System.out.println("ERROR");
            }

            otra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int min = 1;
                    int max = 8;

                    Random r = new Random();
                    int number = r.nextInt(max - min + 1) + min;
                    final String result = String.valueOf(number);

                    if (result.equals("1")) {
                        otra.setImageBitmap(praga1);

                    } else if (result.equals("2")) {
                        otra.setImageBitmap(praga2);

                    } else if (result.equals("3")) {
                        otra.setImageBitmap(praga3);

                    } else if (result.equals("4")) {
                        otra.setImageBitmap(praga4);

                    } else if (result.equals("5")) {
                        otra.setImageBitmap(praga5);

                    } else if (result.equals("6")) {
                        otra.setImageBitmap(praga6);

                    } else if (result.equals("7")) {
                        otra.setImageBitmap(praga7);

                    } else if (result.equals("8")) {
                        otra.setImageBitmap(praga8);

                    } else {
                        System.out.println("ERROR");
                    }
                }
            });


            final double[] coord3 = new double[]{50.0880400, 14.4207600};
            resuelvo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                    reg.putExtra("Score", score);
                    reg.putExtra("coord", coord3);
                    startActivity(reg);


                }
            });
        } else if (ciudad.equals("Roma")) {

            final Bitmap rome1 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome1);
            final Bitmap rome2 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome2);
            final Bitmap rome3 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome3);
            final Bitmap rome4 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome4);
            final Bitmap rome5 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome5);
            final Bitmap rome6 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome6);
            final Bitmap rome8 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome8);
            final Bitmap rome9 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome9);

            if (result.equals("1")) {
                otra.setImageBitmap(rome1);

            } else if (result.equals("2")) {
                otra.setImageBitmap(rome2);

            } else if (result.equals("3")) {
                otra.setImageBitmap(rome3);

            } else if (result.equals("4")) {
                otra.setImageBitmap(rome4);

            } else if (result.equals("5")) {
                otra.setImageBitmap(rome5);

            } else if (result.equals("6")) {
                otra.setImageBitmap(rome6);

            } else if (result.equals("7")) {
                otra.setImageBitmap(rome8);

            } else if (result.equals("8")) {
                otra.setImageBitmap(rome9);

            } else {
                System.out.println("ERROR");
            }

            otra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int min = 1;
                    int max = 8;

                    Random r = new Random();
                    int number = r.nextInt(max - min + 1) + min;
                    final String result = String.valueOf(number);

                    if (result.equals("1")) {
                        otra.setImageBitmap(rome1);

                    } else if (result.equals("2")) {
                        otra.setImageBitmap(rome2);

                    } else if (result.equals("3")) {
                        otra.setImageBitmap(rome3);

                    } else if (result.equals("4")) {
                        otra.setImageBitmap(rome4);

                    } else if (result.equals("5")) {
                        otra.setImageBitmap(rome5);

                    } else if (result.equals("6")) {
                        otra.setImageBitmap(rome6);

                    } else if (result.equals("7")) {
                        otra.setImageBitmap(rome8);

                    } else if (result.equals("8")) {
                        otra.setImageBitmap(rome9);

                    } else {
                        System.out.println("ERROR");
                    }

                }
            });


            final double[] coord3 = new double[]{41.8919300, 12.5113300};
            resuelvo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                    reg.putExtra("Score", score);
                    reg.putExtra("coord", coord3);
                    startActivity(reg);


                }
            });
        } else if (ciudad.equals("Valencia")) {

            final Bitmap valencia1 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale1);
            final Bitmap valencia2 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale2);
            final Bitmap valencia3 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale3);
            final Bitmap valencia4 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale4);
            final Bitmap valencia5 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale5);
            final Bitmap valencia6 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale6);
            final Bitmap valencia7 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale7);
            final Bitmap valencia8 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale8);

            if (result.equals("1")) {
                otra.setImageBitmap(valencia1);

            } else if (result.equals("2")) {
                otra.setImageBitmap(valencia2);

            } else if (result.equals("3")) {
                otra.setImageBitmap(valencia3);

            } else if (result.equals("4")) {
                otra.setImageBitmap(valencia4);

            } else if (result.equals("5")) {
                otra.setImageBitmap(valencia5);

            } else if (result.equals("6")) {
                otra.setImageBitmap(valencia6);

            } else if (result.equals("7")) {
                otra.setImageBitmap(valencia7);

            } else if (result.equals("8")) {
                otra.setImageBitmap(valencia8);

            } else {
                System.out.println("ERROR");
            }

            otra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int min = 1;
                    int max = 8;

                    Random r = new Random();
                    int number = r.nextInt(max - min + 1) + min;
                    final String result = String.valueOf(number);

                    if (result.equals("1")) {
                        otra.setImageBitmap(valencia1);

                    } else if (result.equals("2")) {
                        otra.setImageBitmap(valencia2);

                    } else if (result.equals("3")) {
                        otra.setImageBitmap(valencia3);

                    } else if (result.equals("4")) {
                        otra.setImageBitmap(valencia4);

                    } else if (result.equals("5")) {
                        otra.setImageBitmap(valencia5);

                    } else if (result.equals("6")) {
                        otra.setImageBitmap(valencia6);

                    } else if (result.equals("7")) {
                        otra.setImageBitmap(valencia7);

                    } else if (result.equals("8")) {
                        otra.setImageBitmap(valencia8);

                    } else {
                        System.out.println("ERROR");
                    }

                }
            });


            final double[] coord3 = new double[]{39.4697500, -0.3773900};
            resuelvo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                    reg.putExtra("Score", score);
                    reg.putExtra("coord", coord3);
                    startActivity(reg);


                }
            });
        } else if (ciudad.equals("Venecia")) {

            final Bitmap venecia1 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia1);
            final Bitmap venecia2 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia2);
            final Bitmap venecia3 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia3);
            final Bitmap venecia4 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia4);
            final Bitmap venecia5 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia5);
            final Bitmap venecia6 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia6);
            final Bitmap venecia7 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia7);
            final Bitmap venecia8 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia8);


            if (result.equals("1")) {
                otra.setImageBitmap(venecia1);

            } else if (result.equals("2")) {
                otra.setImageBitmap(venecia2);

            } else if (result.equals("3")) {
                otra.setImageBitmap(venecia3);

            } else if (result.equals("4")) {
                otra.setImageBitmap(venecia4);

            } else if (result.equals("5")) {
                otra.setImageBitmap(venecia5);

            } else if (result.equals("6")) {
                otra.setImageBitmap(venecia6);

            } else if (result.equals("7")) {
                otra.setImageBitmap(venecia7);

            } else if (result.equals("8")) {
                otra.setImageBitmap(venecia8);

            } else {
                System.out.println("ERROR");
            }

            otra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int min = 1;
                    int max = 8;

                    Random r = new Random();
                    int number = r.nextInt(max - min + 1) + min;
                    final String result = String.valueOf(number);


                    if (result.equals("1")) {
                        otra.setImageBitmap(venecia1);

                    } else if (result.equals("2")) {
                        otra.setImageBitmap(venecia2);

                    } else if (result.equals("3")) {
                        otra.setImageBitmap(venecia3);

                    } else if (result.equals("4")) {
                        otra.setImageBitmap(venecia4);

                    } else if (result.equals("5")) {
                        otra.setImageBitmap(venecia5);

                    } else if (result.equals("6")) {
                        otra.setImageBitmap(venecia6);

                    } else if (result.equals("7")) {
                        otra.setImageBitmap(venecia7);

                    } else if (result.equals("8")) {
                        otra.setImageBitmap(venecia8);

                    } else {
                        System.out.println("ERROR");
                    }


                }
            });


            final double[] coord3 = new double[]{45.4371300, 12.3326500};
            resuelvo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                    reg.putExtra("Score", score);
                    reg.putExtra("coord", coord3);
                    startActivity(reg);


                }
            });
        }
    }
}

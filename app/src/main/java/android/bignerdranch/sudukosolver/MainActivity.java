package android.bignerdranch.sudukosolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    // 9x9 sudoko grid
    private Integer[][] sudokuGrid = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}};

    //all text fields of the app
    private EditText cell11;
    private EditText cell12;
    private EditText cell13;
    private EditText cell14;
    private EditText cell15;
    private EditText cell16;
    private EditText cell17;
    private EditText cell18;
    private EditText cell19;
    private EditText cell21;
    private EditText cell22;
    private EditText cell23;
    private EditText cell24;
    private EditText cell25;
    private EditText cell26;
    private EditText cell27;
    private EditText cell28;
    private EditText cell29;
    private EditText cell31;
    private EditText cell32;
    private EditText cell33;
    private EditText cell34;
    private EditText cell35;
    private EditText cell36;
    private EditText cell37;
    private EditText cell38;
    private EditText cell39;
    private EditText cell41;
    private EditText cell42;
    private EditText cell43;
    private EditText cell44;
    private EditText cell45;
    private EditText cell46;
    private EditText cell47;
    private EditText cell48;
    private EditText cell49;
    private EditText cell51;
    private EditText cell52;
    private EditText cell53;
    private EditText cell54;
    private EditText cell55;
    private EditText cell56;
    private EditText cell57;
    private EditText cell58;
    private EditText cell59;
    private EditText cell61;
    private EditText cell62;
    private EditText cell63;
    private EditText cell64;
    private EditText cell65;
    private EditText cell66;
    private EditText cell67;
    private EditText cell68;
    private EditText cell69;
    private EditText cell71;
    private EditText cell72;
    private EditText cell73;
    private EditText cell74;
    private EditText cell75;
    private EditText cell76;
    private EditText cell77;
    private EditText cell78;
    private EditText cell79;
    private EditText cell81;
    private EditText cell82;
    private EditText cell83;
    private EditText cell84;
    private EditText cell85;
    private EditText cell86;
    private EditText cell87;
    private EditText cell88;
    private EditText cell89;
    private EditText cell91;
    private EditText cell92;
    private EditText cell93;
    private EditText cell94;
    private EditText cell95;
    private EditText cell96;
    private EditText cell97;
    private EditText cell98;
    private EditText cell99;

    //value of text fields
    private String cell11Val = "";
    private String cell12Val = "";
    private String cell13Val = "";
    private String cell14Val = "";
    private String cell15Val = "";
    private String cell16Val = "";
    private String cell17Val = "";
    private String cell18Val = "";
    private String cell19Val = "";
    private String cell21Val = "";
    private String cell22Val = "";
    private String cell23Val = "";
    private String cell24Val = "";
    private String cell25Val = "";
    private String cell26Val = "";
    private String cell27Val = "";
    private String cell28Val = "";
    private String cell29Val = "";
    private String cell31Val = "";
    private String cell32Val = "";
    private String cell33Val = "";
    private String cell34Val = "";
    private String cell35Val = "";
    private String cell36Val = "";
    private String cell37Val = "";
    private String cell38Val = "";
    private String cell39Val = "";
    private String cell41Val = "";
    private String cell42Val = "";
    private String cell43Val = "";
    private String cell44Val = "";
    private String cell45Val = "";
    private String cell46Val = "";
    private String cell47Val = "";
    private String cell48Val = "";
    private String cell49Val = "";
    private String cell51Val = "";
    private String cell52Val = "";
    private String cell53Val = "";
    private String cell54Val = "";
    private String cell55Val = "";
    private String cell56Val = "";
    private String cell57Val = "";
    private String cell58Val = "";
    private String cell59Val = "";
    private String cell61Val = "";
    private String cell62Val = "";
    private String cell63Val = "";
    private String cell64Val = "";
    private String cell65Val = "";
    private String cell66Val = "";
    private String cell67Val = "";
    private String cell68Val = "";
    private String cell69Val = "";
    private String cell71Val = "";
    private String cell72Val = "";
    private String cell73Val = "";
    private String cell74Val = "";
    private String cell75Val = "";
    private String cell76Val = "";
    private String cell77Val = "";
    private String cell78Val = "";
    private String cell79Val = "";
    private String cell81Val = "";
    private String cell82Val = "";
    private String cell83Val = "";
    private String cell84Val = "";
    private String cell85Val = "";
    private String cell86Val = "";
    private String cell87Val = "";
    private String cell88Val = "";
    private String cell89Val = "";
    private String cell91Val = "";
    private String cell92Val = "";
    private String cell93Val = "";
    private String cell94Val = "";
    private String cell95Val = "";
    private String cell96Val = "";
    private String cell97Val = "";
    private String cell98Val = "";
    private String cell99Val = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //The two buttons
        Button solve = (Button) findViewById(R.id.solve);
        Button clear = (Button) findViewById(R.id.clear);

        //finds all the text edits, and connects them
        findAllEditText();

        //Text listener on each field updates their values
        addTextListener();

        solve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Solver Button Pressed", Toast.LENGTH_SHORT).show();
                solve();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clear Button Pressed", Toast.LENGTH_SHORT).show();
                clearEditTexts();
            }
        });
    }

    private void solve() {
        //Reset entire cTable
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                sudokuGrid[i][j] = 0;
            }
        }
         //Set all values in the grid
        setGridValues();

        if (recurse()) {
            setEditTextValues();
        }
    }

    private boolean recurse() {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (sudokuGrid[i][j] == 0) {
                    for (int k = 1; k < 10; ++k) {
                        if (check(i, j, k)) {
                            sudokuGrid[i][j] = k;
                            if (recurse()) {
                                return true;
                            }
                            sudokuGrid[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean check(int y, int x, int n) {
        for (int i = 0; i < 9; ++i) {
            if (sudokuGrid[y][i] == n) {
                return false;
            }
            if (sudokuGrid[i][x] == n) {
                return false;
            }
        }

        int x0 = (x/3) * 3;
        int y0 = (y/3) * 3;

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (sudokuGrid[y0 + i][x0 + j] == n) {
                    return false;
                }
            }
        }
        return true;
    }

    private void findAllEditText() {
        cell11 = (EditText) findViewById(R.id._11);
        cell12 = (EditText) findViewById(R.id._12);
        cell13 = (EditText) findViewById(R.id._13);
        cell14 = (EditText) findViewById(R.id._14);
        cell15 = (EditText) findViewById(R.id._15);
        cell16 = (EditText) findViewById(R.id._16);
        cell17 = (EditText) findViewById(R.id._17);
        cell18 = (EditText) findViewById(R.id._18);
        cell19 = (EditText) findViewById(R.id._19);
        cell21 = (EditText) findViewById(R.id._21);
        cell22 = (EditText) findViewById(R.id._22);
        cell23 = (EditText) findViewById(R.id._23);
        cell24 = (EditText) findViewById(R.id._24);
        cell25 = (EditText) findViewById(R.id._25);
        cell26 = (EditText) findViewById(R.id._26);
        cell27 = (EditText) findViewById(R.id._27);
        cell28 = (EditText) findViewById(R.id._28);
        cell29 = (EditText) findViewById(R.id._29);
        cell31 = (EditText) findViewById(R.id._31);
        cell32 = (EditText) findViewById(R.id._32);
        cell33 = (EditText) findViewById(R.id._33);
        cell34 = (EditText) findViewById(R.id._34);
        cell35 = (EditText) findViewById(R.id._35);
        cell36 = (EditText) findViewById(R.id._36);
        cell37 = (EditText) findViewById(R.id._37);
        cell38 = (EditText) findViewById(R.id._38);
        cell39 = (EditText) findViewById(R.id._39);
        cell41 = (EditText) findViewById(R.id._41);
        cell42 = (EditText) findViewById(R.id._42);
        cell43 = (EditText) findViewById(R.id._43);
        cell44 = (EditText) findViewById(R.id._44);
        cell45 = (EditText) findViewById(R.id._45);
        cell46 = (EditText) findViewById(R.id._46);
        cell47 = (EditText) findViewById(R.id._47);
        cell48 = (EditText) findViewById(R.id._48);
        cell49 = (EditText) findViewById(R.id._49);
        cell51 = (EditText) findViewById(R.id._51);
        cell52 = (EditText) findViewById(R.id._52);
        cell53 = (EditText) findViewById(R.id._53);
        cell54 = (EditText) findViewById(R.id._54);
        cell55 = (EditText) findViewById(R.id._55);
        cell56 = (EditText) findViewById(R.id._56);
        cell57 = (EditText) findViewById(R.id._57);
        cell58 = (EditText) findViewById(R.id._58);
        cell59 = (EditText) findViewById(R.id._59);
        cell61 = (EditText) findViewById(R.id._61);
        cell62 = (EditText) findViewById(R.id._62);
        cell63 = (EditText) findViewById(R.id._63);
        cell64 = (EditText) findViewById(R.id._64);
        cell65 = (EditText) findViewById(R.id._65);
        cell66 = (EditText) findViewById(R.id._66);
        cell67 = (EditText) findViewById(R.id._67);
        cell68 = (EditText) findViewById(R.id._68);
        cell69 = (EditText) findViewById(R.id._69);
        cell71 = (EditText) findViewById(R.id._71);
        cell72 = (EditText) findViewById(R.id._72);
        cell73 = (EditText) findViewById(R.id._73);
        cell74 = (EditText) findViewById(R.id._74);
        cell75 = (EditText) findViewById(R.id._75);
        cell76 = (EditText) findViewById(R.id._76);
        cell77 = (EditText) findViewById(R.id._77);
        cell78 = (EditText) findViewById(R.id._78);
        cell79 = (EditText) findViewById(R.id._79);
        cell81 = (EditText) findViewById(R.id._81);
        cell82 = (EditText) findViewById(R.id._82);
        cell83 = (EditText) findViewById(R.id._83);
        cell84 = (EditText) findViewById(R.id._84);
        cell85 = (EditText) findViewById(R.id._85);
        cell86 = (EditText) findViewById(R.id._86);
        cell87 = (EditText) findViewById(R.id._87);
        cell88 = (EditText) findViewById(R.id._88);
        cell89 = (EditText) findViewById(R.id._89);
        cell91 = (EditText) findViewById(R.id._91);
        cell92 = (EditText) findViewById(R.id._92);
        cell93 = (EditText) findViewById(R.id._93);
        cell94 = (EditText) findViewById(R.id._94);
        cell95 = (EditText) findViewById(R.id._95);
        cell96 = (EditText) findViewById(R.id._96);
        cell97 = (EditText) findViewById(R.id._97);
        cell98 = (EditText) findViewById(R.id._98);
        cell99 = (EditText) findViewById(R.id._99);
    }

    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            cell11Val = cell11.getText().toString().trim();
            cell12Val = cell12.getText().toString().trim();
            cell13Val = cell13.getText().toString().trim();
            cell14Val = cell14.getText().toString().trim();
            cell15Val = cell15.getText().toString().trim();
            cell16Val = cell16.getText().toString().trim();
            cell17Val = cell17.getText().toString().trim();
            cell18Val = cell18.getText().toString().trim();
            cell19Val = cell19.getText().toString().trim();
            cell21Val = cell21.getText().toString().trim();
            cell22Val = cell22.getText().toString().trim();
            cell23Val = cell23.getText().toString().trim();
            cell24Val = cell24.getText().toString().trim();
            cell25Val = cell25.getText().toString().trim();
            cell26Val = cell26.getText().toString().trim();
            cell27Val = cell27.getText().toString().trim();
            cell28Val = cell28.getText().toString().trim();
            cell29Val = cell29.getText().toString().trim();
            cell31Val = cell31.getText().toString().trim();
            cell32Val = cell32.getText().toString().trim();
            cell33Val = cell33.getText().toString().trim();
            cell34Val = cell34.getText().toString().trim();
            cell35Val = cell35.getText().toString().trim();
            cell36Val = cell36.getText().toString().trim();
            cell37Val = cell37.getText().toString().trim();
            cell38Val = cell38.getText().toString().trim();
            cell39Val = cell39.getText().toString().trim();
            cell41Val = cell41.getText().toString().trim();
            cell42Val = cell42.getText().toString().trim();
            cell43Val = cell43.getText().toString().trim();
            cell44Val = cell44.getText().toString().trim();
            cell45Val = cell45.getText().toString().trim();
            cell46Val = cell46.getText().toString().trim();
            cell47Val = cell47.getText().toString().trim();
            cell48Val = cell48.getText().toString().trim();
            cell49Val = cell49.getText().toString().trim();
            cell51Val = cell51.getText().toString().trim();
            cell52Val = cell52.getText().toString().trim();
            cell53Val = cell53.getText().toString().trim();
            cell54Val = cell54.getText().toString().trim();
            cell55Val = cell55.getText().toString().trim();
            cell56Val = cell56.getText().toString().trim();
            cell57Val = cell57.getText().toString().trim();
            cell58Val = cell58.getText().toString().trim();
            cell59Val = cell59.getText().toString().trim();
            cell61Val = cell61.getText().toString().trim();
            cell62Val = cell62.getText().toString().trim();
            cell63Val = cell63.getText().toString().trim();
            cell64Val = cell64.getText().toString().trim();
            cell65Val = cell65.getText().toString().trim();
            cell66Val = cell66.getText().toString().trim();
            cell67Val = cell67.getText().toString().trim();
            cell68Val = cell68.getText().toString().trim();
            cell69Val = cell69.getText().toString().trim();
            cell71Val = cell71.getText().toString().trim();
            cell72Val = cell72.getText().toString().trim();
            cell73Val = cell73.getText().toString().trim();
            cell74Val = cell74.getText().toString().trim();
            cell75Val = cell75.getText().toString().trim();
            cell76Val = cell76.getText().toString().trim();
            cell77Val = cell77.getText().toString().trim();
            cell78Val = cell78.getText().toString().trim();
            cell79Val = cell79.getText().toString().trim();
            cell81Val = cell81.getText().toString().trim();
            cell82Val = cell82.getText().toString().trim();
            cell83Val = cell83.getText().toString().trim();
            cell84Val = cell84.getText().toString().trim();
            cell85Val = cell85.getText().toString().trim();
            cell86Val = cell86.getText().toString().trim();
            cell87Val = cell87.getText().toString().trim();
            cell88Val = cell88.getText().toString().trim();
            cell89Val = cell89.getText().toString().trim();
            cell91Val = cell91.getText().toString().trim();
            cell92Val = cell92.getText().toString().trim();
            cell93Val = cell93.getText().toString().trim();
            cell94Val = cell94.getText().toString().trim();
            cell95Val = cell95.getText().toString().trim();
            cell96Val = cell96.getText().toString().trim();
            cell97Val = cell97.getText().toString().trim();
            cell98Val = cell98.getText().toString().trim();
            cell99Val = cell99.getText().toString().trim();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    private void addTextListener() {
        cell11.addTextChangedListener(textWatcher);
        cell12.addTextChangedListener(textWatcher);
        cell13.addTextChangedListener(textWatcher);
        cell14.addTextChangedListener(textWatcher);
        cell15.addTextChangedListener(textWatcher);
        cell16.addTextChangedListener(textWatcher);
        cell17.addTextChangedListener(textWatcher);
        cell18.addTextChangedListener(textWatcher);
        cell19.addTextChangedListener(textWatcher);
        cell21.addTextChangedListener(textWatcher);
        cell22.addTextChangedListener(textWatcher);
        cell23.addTextChangedListener(textWatcher);
        cell24.addTextChangedListener(textWatcher);
        cell25.addTextChangedListener(textWatcher);
        cell26.addTextChangedListener(textWatcher);
        cell27.addTextChangedListener(textWatcher);
        cell28.addTextChangedListener(textWatcher);
        cell29.addTextChangedListener(textWatcher);
        cell31.addTextChangedListener(textWatcher);
        cell32.addTextChangedListener(textWatcher);
        cell33.addTextChangedListener(textWatcher);
        cell34.addTextChangedListener(textWatcher);
        cell35.addTextChangedListener(textWatcher);
        cell36.addTextChangedListener(textWatcher);
        cell37.addTextChangedListener(textWatcher);
        cell38.addTextChangedListener(textWatcher);
        cell39.addTextChangedListener(textWatcher);
        cell41.addTextChangedListener(textWatcher);
        cell42.addTextChangedListener(textWatcher);
        cell43.addTextChangedListener(textWatcher);
        cell44.addTextChangedListener(textWatcher);
        cell45.addTextChangedListener(textWatcher);
        cell46.addTextChangedListener(textWatcher);
        cell47.addTextChangedListener(textWatcher);
        cell48.addTextChangedListener(textWatcher);
        cell49.addTextChangedListener(textWatcher);
        cell51.addTextChangedListener(textWatcher);
        cell52.addTextChangedListener(textWatcher);
        cell53.addTextChangedListener(textWatcher);
        cell54.addTextChangedListener(textWatcher);
        cell55.addTextChangedListener(textWatcher);
        cell56.addTextChangedListener(textWatcher);
        cell57.addTextChangedListener(textWatcher);
        cell58.addTextChangedListener(textWatcher);
        cell59.addTextChangedListener(textWatcher);
        cell61.addTextChangedListener(textWatcher);
        cell62.addTextChangedListener(textWatcher);
        cell63.addTextChangedListener(textWatcher);
        cell64.addTextChangedListener(textWatcher);
        cell65.addTextChangedListener(textWatcher);
        cell66.addTextChangedListener(textWatcher);
        cell67.addTextChangedListener(textWatcher);
        cell68.addTextChangedListener(textWatcher);
        cell69.addTextChangedListener(textWatcher);
        cell71.addTextChangedListener(textWatcher);
        cell72.addTextChangedListener(textWatcher);
        cell73.addTextChangedListener(textWatcher);
        cell74.addTextChangedListener(textWatcher);
        cell75.addTextChangedListener(textWatcher);
        cell76.addTextChangedListener(textWatcher);
        cell77.addTextChangedListener(textWatcher);
        cell78.addTextChangedListener(textWatcher);
        cell79.addTextChangedListener(textWatcher);
        cell81.addTextChangedListener(textWatcher);
        cell82.addTextChangedListener(textWatcher);
        cell83.addTextChangedListener(textWatcher);
        cell84.addTextChangedListener(textWatcher);
        cell85.addTextChangedListener(textWatcher);
        cell86.addTextChangedListener(textWatcher);
        cell87.addTextChangedListener(textWatcher);
        cell88.addTextChangedListener(textWatcher);
        cell89.addTextChangedListener(textWatcher);
        cell91.addTextChangedListener(textWatcher);
        cell92.addTextChangedListener(textWatcher);
        cell93.addTextChangedListener(textWatcher);
        cell94.addTextChangedListener(textWatcher);
        cell95.addTextChangedListener(textWatcher);
        cell96.addTextChangedListener(textWatcher);
        cell97.addTextChangedListener(textWatcher);
        cell98.addTextChangedListener(textWatcher);
        cell99.addTextChangedListener(textWatcher);
    }

    private void clearEditTexts() {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                sudokuGrid[i][j] = 0;
            }
        }

        cell11.setText("");
        cell12.setText("");
        cell13.setText("");
        cell14.setText("");
        cell15.setText("");
        cell16.setText("");
        cell17.setText("");
        cell18.setText("");
        cell19.setText("");
        cell21.setText("");
        cell22.setText("");
        cell23.setText("");
        cell24.setText("");
        cell25.setText("");
        cell26.setText("");
        cell27.setText("");
        cell28.setText("");
        cell29.setText("");
        cell31.setText("");
        cell32.setText("");
        cell33.setText("");
        cell34.setText("");
        cell35.setText("");
        cell36.setText("");
        cell37.setText("");
        cell38.setText("");
        cell39.setText("");
        cell41.setText("");
        cell42.setText("");
        cell43.setText("");
        cell44.setText("");
        cell45.setText("");
        cell46.setText("");
        cell47.setText("");
        cell48.setText("");
        cell49.setText("");
        cell51.setText("");
        cell52.setText("");
        cell53.setText("");
        cell54.setText("");
        cell55.setText("");
        cell56.setText("");
        cell57.setText("");
        cell58.setText("");
        cell59.setText("");
        cell61.setText("");
        cell62.setText("");
        cell63.setText("");
        cell64.setText("");
        cell65.setText("");
        cell66.setText("");
        cell67.setText("");
        cell68.setText("");
        cell69.setText("");
        cell71.setText("");
        cell72.setText("");
        cell73.setText("");
        cell74.setText("");
        cell75.setText("");
        cell76.setText("");
        cell77.setText("");
        cell78.setText("");
        cell79.setText("");
        cell81.setText("");
        cell82.setText("");
        cell83.setText("");
        cell84.setText("");
        cell85.setText("");
        cell86.setText("");
        cell87.setText("");
        cell88.setText("");
        cell89.setText("");
        cell91.setText("");
        cell92.setText("");
        cell93.setText("");
        cell94.setText("");
        cell95.setText("");
        cell96.setText("");
        cell97.setText("");
        cell98.setText("");
        cell99.setText("");

        cell11Val = "";
        cell12Val = "";
        cell13Val = "";
        cell14Val = "";
        cell15Val = "";
        cell16Val = "";
        cell17Val = "";
        cell18Val = "";
        cell19Val = "";
        cell21Val = "";
        cell22Val = "";
        cell23Val = "";
        cell24Val = "";
        cell25Val = "";
        cell26Val = "";
        cell27Val = "";
        cell28Val = "";
        cell29Val = "";
        cell31Val = "";
        cell32Val = "";
        cell33Val = "";
        cell34Val = "";
        cell35Val = "";
        cell36Val = "";
        cell37Val = "";
        cell38Val = "";
        cell39Val = "";
        cell41Val = "";
        cell42Val = "";
        cell43Val = "";
        cell44Val = "";
        cell45Val = "";
        cell46Val = "";
        cell47Val = "";
        cell48Val = "";
        cell49Val = "";
        cell51Val = "";
        cell52Val = "";
        cell53Val = "";
        cell54Val = "";
        cell55Val = "";
        cell56Val = "";
        cell57Val = "";
        cell58Val = "";
        cell59Val = "";
        cell61Val = "";
        cell62Val = "";
        cell63Val = "";
        cell64Val = "";
        cell65Val = "";
        cell66Val = "";
        cell67Val = "";
        cell68Val = "";
        cell69Val = "";
        cell71Val = "";
        cell72Val = "";
        cell73Val = "";
        cell74Val = "";
        cell75Val = "";
        cell76Val = "";
        cell77Val = "";
        cell78Val = "";
        cell79Val = "";
        cell81Val = "";
        cell82Val = "";
        cell83Val = "";
        cell84Val = "";
        cell85Val = "";
        cell86Val = "";
        cell87Val = "";
        cell88Val = "";
        cell89Val = "";
        cell91Val = "";
        cell92Val = "";
        cell93Val = "";
        cell94Val = "";
        cell95Val = "";
        cell96Val = "";
        cell97Val = "";
        cell98Val = "";
        cell99Val = "";

    }

    private void setGridValues() {
        if (!cell11Val.equals("")) {
            sudokuGrid[0][0] = Integer.valueOf(cell11Val);
        }
        if (!cell12Val.equals("")) {
            sudokuGrid[0][1] = Integer.valueOf(cell12Val);
        }
        if (!cell13Val.equals("")) {
            sudokuGrid[0][2] = Integer.valueOf(cell13Val);
        }
        if (!cell14Val.equals("")) {
            sudokuGrid[0][3] = Integer.valueOf(cell14Val);
        }
        if (!cell15Val.equals("")) {
            sudokuGrid[0][4] = Integer.valueOf(cell15Val);
        }
        if (!cell16Val.equals("")) {
            sudokuGrid[0][5] = Integer.valueOf(cell16Val);
        }
        if (!cell17Val.equals("")) {
            sudokuGrid[0][6] = Integer.valueOf(cell17Val);
        }
        if (!cell18Val.equals("")) {
            sudokuGrid[0][7] = Integer.valueOf(cell18Val);
        }
        if (!cell19Val.equals("")) {
            sudokuGrid[0][8] = Integer.valueOf(cell19Val);
        }

        if (!cell21Val.equals("")) {
            sudokuGrid[1][0] = Integer.valueOf(cell21Val);
        }
        if (!cell22Val.equals("")) {
            sudokuGrid[1][1] = Integer.valueOf(cell22Val);
        }
        if (!cell23Val.equals("")) {
            sudokuGrid[1][2] = Integer.valueOf(cell23Val);
        }
        if (!cell24Val.equals("")) {
            sudokuGrid[1][3] = Integer.valueOf(cell24Val);
        }
        if (!cell25Val.equals("")) {
            sudokuGrid[1][4] = Integer.valueOf(cell25Val);
        }
        if (!cell26Val.equals("")) {
            sudokuGrid[1][5] = Integer.valueOf(cell26Val);
        }
        if (!cell27Val.equals("")) {
            sudokuGrid[1][6] = Integer.valueOf(cell27Val);
        }
        if (!cell28Val.equals("")) {
            sudokuGrid[1][7] = Integer.valueOf(cell28Val);
        }
        if (!cell29Val.equals("")) {
            sudokuGrid[1][8] = Integer.valueOf(cell29Val);
        }

        if (!cell31Val.equals("")) {
            sudokuGrid[2][0] = Integer.valueOf(cell31Val);
        }
        if (!cell32Val.equals("")) {
            sudokuGrid[2][1] = Integer.valueOf(cell32Val);
        }
        if (!cell33Val.equals("")) {
            sudokuGrid[2][2] = Integer.valueOf(cell33Val);
        }
        if (!cell34Val.equals("")) {
            sudokuGrid[2][3] = Integer.valueOf(cell34Val);
        }
        if (!cell35Val.equals("")) {
            sudokuGrid[2][4] = Integer.valueOf(cell35Val);
        }
        if (!cell36Val.equals("")) {
            sudokuGrid[2][5] = Integer.valueOf(cell36Val);
        }
        if (!cell37Val.equals("")) {
            sudokuGrid[2][6] = Integer.valueOf(cell37Val);
        }
        if (!cell38Val.equals("")) {
            sudokuGrid[2][7] = Integer.valueOf(cell38Val);
        }
        if (!cell39Val.equals("")) {
            sudokuGrid[2][8] = Integer.valueOf(cell39Val);
        }

        if (!cell41Val.equals("")) {
            sudokuGrid[3][0] = Integer.valueOf(cell41Val);
        }
        if (!cell42Val.equals("")) {
            sudokuGrid[3][1] = Integer.valueOf(cell42Val);
        }
        if (!cell43Val.equals("")) {
            sudokuGrid[3][2] = Integer.valueOf(cell43Val);
        }
        if (!cell44Val.equals("")) {
            sudokuGrid[3][3] = Integer.valueOf(cell44Val);
        }
        if (!cell45Val.equals("")) {
            sudokuGrid[3][4] = Integer.valueOf(cell45Val);
        }
        if (!cell46Val.equals("")) {
            sudokuGrid[3][5] = Integer.valueOf(cell46Val);
        }
        if (!cell47Val.equals("")) {
            sudokuGrid[3][6] = Integer.valueOf(cell47Val);
        }
        if (!cell48Val.equals("")) {
            sudokuGrid[3][7] = Integer.valueOf(cell48Val);
        }
        if (!cell49Val.equals("")) {
            sudokuGrid[3][8] = Integer.valueOf(cell49Val);
        }

        if (!cell51Val.equals("")) {
            sudokuGrid[4][0] = Integer.valueOf(cell51Val);
        }
        if (!cell52Val.equals("")) {
            sudokuGrid[4][1] = Integer.valueOf(cell52Val);
        }
        if (!cell53Val.equals("")) {
            sudokuGrid[4][2] = Integer.valueOf(cell53Val);
        }
        if (!cell54Val.equals("")) {
            sudokuGrid[4][3] = Integer.valueOf(cell54Val);
        }
        if (!cell55Val.equals("")) {
            sudokuGrid[4][4] = Integer.valueOf(cell55Val);
        }
        if (!cell56Val.equals("")) {
            sudokuGrid[4][5] = Integer.valueOf(cell56Val);
        }
        if (!cell57Val.equals("")) {
            sudokuGrid[4][6] = Integer.valueOf(cell57Val);
        }
        if (!cell58Val.equals("")) {
            sudokuGrid[4][7] = Integer.valueOf(cell58Val);
        }
        if (!cell59Val.equals("")) {
            sudokuGrid[4][8] = Integer.valueOf(cell59Val);
        }

        if (!cell61Val.equals("")) {
            sudokuGrid[5][0] = Integer.valueOf(cell61Val);
        }
        if (!cell62Val.equals("")) {
            sudokuGrid[5][1] = Integer.valueOf(cell62Val);
        }
        if (!cell63Val.equals("")) {
            sudokuGrid[5][2] = Integer.valueOf(cell63Val);
        }
        if (!cell64Val.equals("")) {
            sudokuGrid[5][3] = Integer.valueOf(cell64Val);
        }
        if (!cell65Val.equals("")) {
            sudokuGrid[5][4] = Integer.valueOf(cell65Val);
        }
        if (!cell66Val.equals("")) {
            sudokuGrid[5][5] = Integer.valueOf(cell66Val);
        }
        if (!cell67Val.equals("")) {
            sudokuGrid[5][6] = Integer.valueOf(cell67Val);
        }
        if (!cell68Val.equals("")) {
            sudokuGrid[5][7] = Integer.valueOf(cell68Val);
        }
        if (!cell69Val.equals("")) {
            sudokuGrid[5][8] = Integer.valueOf(cell69Val);
        }

        if (!cell71Val.equals("")) {
            sudokuGrid[6][0] = Integer.valueOf(cell71Val);
        }
        if (!cell72Val.equals("")) {
            sudokuGrid[6][1] = Integer.valueOf(cell72Val);
        }
        if (!cell73Val.equals("")) {
            sudokuGrid[6][2] = Integer.valueOf(cell73Val);
        }
        if (!cell74Val.equals("")) {
            sudokuGrid[6][3] = Integer.valueOf(cell74Val);
        }
        if (!cell75Val.equals("")) {
            sudokuGrid[6][4] = Integer.valueOf(cell75Val);
        }
        if (!cell76Val.equals("")) {
            sudokuGrid[6][5] = Integer.valueOf(cell76Val);
        }
        if (!cell77Val.equals("")) {
            sudokuGrid[6][6] = Integer.valueOf(cell77Val);
        }
        if (!cell78Val.equals("")) {
            sudokuGrid[6][7] = Integer.valueOf(cell78Val);
        }
        if (!cell79Val.equals("")) {
            sudokuGrid[6][8] = Integer.valueOf(cell79Val);
        }

        if (!cell81Val.equals("")) {
            sudokuGrid[7][0] = Integer.valueOf(cell81Val);
        }
        if (!cell82Val.equals("")) {
            sudokuGrid[7][1] = Integer.valueOf(cell82Val);
        }
        if (!cell83Val.equals("")) {
            sudokuGrid[7][2] = Integer.valueOf(cell83Val);
        }
        if (!cell84Val.equals("")) {
            sudokuGrid[7][3] = Integer.valueOf(cell84Val);
        }
        if (!cell85Val.equals("")) {
            sudokuGrid[7][4] = Integer.valueOf(cell85Val);
        }
        if (!cell86Val.equals("")) {
            sudokuGrid[7][5] = Integer.valueOf(cell86Val);
        }
        if (!cell87Val.equals("")) {
            sudokuGrid[7][6] = Integer.valueOf(cell87Val);
        }
        if (!cell88Val.equals("")) {
            sudokuGrid[7][7] = Integer.valueOf(cell88Val);
        }
        if (!cell89Val.equals("")) {
            sudokuGrid[7][8] = Integer.valueOf(cell89Val);
        }

        if (!cell91Val.equals("")) {
            sudokuGrid[8][0] = Integer.valueOf(cell91Val);
        }
        if (!cell92Val.equals("")) {
            sudokuGrid[8][1] = Integer.valueOf(cell92Val);
        }
        if (!cell93Val.equals("")) {
            sudokuGrid[8][2] = Integer.valueOf(cell93Val);
        }
        if (!cell94Val.equals("")) {
            sudokuGrid[8][3] = Integer.valueOf(cell94Val);
        }
        if (!cell95Val.equals("")) {
            sudokuGrid[8][4] = Integer.valueOf(cell95Val);
        }
        if (!cell96Val.equals("")) {
            sudokuGrid[8][5] = Integer.valueOf(cell96Val);
        }
        if (!cell97Val.equals("")) {
            sudokuGrid[8][6] = Integer.valueOf(cell97Val);
        }
        if (!cell98Val.equals("")) {
            sudokuGrid[8][7] = Integer.valueOf(cell98Val);
        }
        if (!cell99Val.equals("")) {
            sudokuGrid[8][8] = Integer.valueOf(cell99Val);
        }
    }

    private void setEditTextValues() {
        cell11.setText(String.valueOf(sudokuGrid[0][0]));
        cell12.setText(String.valueOf(sudokuGrid[0][1]));
        cell13.setText(String.valueOf(sudokuGrid[0][2]));
        cell14.setText(String.valueOf(sudokuGrid[0][3]));
        cell15.setText(String.valueOf(sudokuGrid[0][4]));
        cell16.setText(String.valueOf(sudokuGrid[0][5]));
        cell17.setText(String.valueOf(sudokuGrid[0][6]));
        cell18.setText(String.valueOf(sudokuGrid[0][7]));
        cell19.setText(String.valueOf(sudokuGrid[0][8]));
        cell21.setText(String.valueOf(sudokuGrid[1][0]));
        cell22.setText(String.valueOf(sudokuGrid[1][1]));
        cell23.setText(String.valueOf(sudokuGrid[1][2]));
        cell24.setText(String.valueOf(sudokuGrid[1][3]));
        cell25.setText(String.valueOf(sudokuGrid[1][4]));
        cell26.setText(String.valueOf(sudokuGrid[1][5]));
        cell27.setText(String.valueOf(sudokuGrid[1][6]));
        cell28.setText(String.valueOf(sudokuGrid[1][7]));
        cell29.setText(String.valueOf(sudokuGrid[1][8]));
        cell31.setText(String.valueOf(sudokuGrid[2][0]));
        cell32.setText(String.valueOf(sudokuGrid[2][1]));
        cell33.setText(String.valueOf(sudokuGrid[2][2]));
        cell34.setText(String.valueOf(sudokuGrid[2][3]));
        cell35.setText(String.valueOf(sudokuGrid[2][4]));
        cell36.setText(String.valueOf(sudokuGrid[2][5]));
        cell37.setText(String.valueOf(sudokuGrid[2][6]));
        cell38.setText(String.valueOf(sudokuGrid[2][7]));
        cell39.setText(String.valueOf(sudokuGrid[2][8]));
        cell41.setText(String.valueOf(sudokuGrid[3][0]));
        cell42.setText(String.valueOf(sudokuGrid[3][1]));
        cell43.setText(String.valueOf(sudokuGrid[3][2]));
        cell44.setText(String.valueOf(sudokuGrid[3][3]));
        cell45.setText(String.valueOf(sudokuGrid[3][4]));
        cell46.setText(String.valueOf(sudokuGrid[3][5]));
        cell47.setText(String.valueOf(sudokuGrid[3][6]));
        cell48.setText(String.valueOf(sudokuGrid[3][7]));
        cell49.setText(String.valueOf(sudokuGrid[3][8]));
        cell51.setText(String.valueOf(sudokuGrid[4][0]));
        cell52.setText(String.valueOf(sudokuGrid[4][1]));
        cell53.setText(String.valueOf(sudokuGrid[4][2]));
        cell54.setText(String.valueOf(sudokuGrid[4][3]));
        cell55.setText(String.valueOf(sudokuGrid[4][4]));
        cell56.setText(String.valueOf(sudokuGrid[4][5]));
        cell57.setText(String.valueOf(sudokuGrid[4][6]));
        cell58.setText(String.valueOf(sudokuGrid[4][7]));
        cell59.setText(String.valueOf(sudokuGrid[4][8]));
        cell61.setText(String.valueOf(sudokuGrid[5][0]));
        cell62.setText(String.valueOf(sudokuGrid[5][1]));
        cell63.setText(String.valueOf(sudokuGrid[5][2]));
        cell64.setText(String.valueOf(sudokuGrid[5][3]));
        cell65.setText(String.valueOf(sudokuGrid[5][4]));
        cell66.setText(String.valueOf(sudokuGrid[5][5]));
        cell67.setText(String.valueOf(sudokuGrid[5][6]));
        cell68.setText(String.valueOf(sudokuGrid[5][7]));
        cell69.setText(String.valueOf(sudokuGrid[5][8]));
        cell71.setText(String.valueOf(sudokuGrid[6][0]));
        cell72.setText(String.valueOf(sudokuGrid[6][1]));
        cell73.setText(String.valueOf(sudokuGrid[6][2]));
        cell74.setText(String.valueOf(sudokuGrid[6][3]));
        cell75.setText(String.valueOf(sudokuGrid[6][4]));
        cell76.setText(String.valueOf(sudokuGrid[6][5]));
        cell77.setText(String.valueOf(sudokuGrid[6][6]));
        cell78.setText(String.valueOf(sudokuGrid[6][7]));
        cell79.setText(String.valueOf(sudokuGrid[6][8]));
        cell81.setText(String.valueOf(sudokuGrid[7][0]));
        cell82.setText(String.valueOf(sudokuGrid[7][1]));
        cell83.setText(String.valueOf(sudokuGrid[7][2]));
        cell84.setText(String.valueOf(sudokuGrid[7][3]));
        cell85.setText(String.valueOf(sudokuGrid[7][4]));
        cell86.setText(String.valueOf(sudokuGrid[7][5]));
        cell87.setText(String.valueOf(sudokuGrid[7][6]));
        cell88.setText(String.valueOf(sudokuGrid[7][7]));
        cell89.setText(String.valueOf(sudokuGrid[7][8]));
        cell91.setText(String.valueOf(sudokuGrid[8][0]));
        cell92.setText(String.valueOf(sudokuGrid[8][1]));
        cell93.setText(String.valueOf(sudokuGrid[8][2]));
        cell94.setText(String.valueOf(sudokuGrid[8][3]));
        cell95.setText(String.valueOf(sudokuGrid[8][4]));
        cell96.setText(String.valueOf(sudokuGrid[8][5]));
        cell97.setText(String.valueOf(sudokuGrid[8][6]));
        cell98.setText(String.valueOf(sudokuGrid[8][7]));
        cell99.setText(String.valueOf(sudokuGrid[8][8]));
    }
}

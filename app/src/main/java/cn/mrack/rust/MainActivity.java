package cn.mrack.rust;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.windcloud.plugin.mac.utils.ModifyMacUtils;

import cn.mrack.rust.databinding.ActivityMainBinding;

/**
 * @author Lime
 * @date 2022/2/15
 */
public class MainActivity extends AppCompatActivity {


    public static final String TAG = "MainActivity";

    private ActivityMainBinding binding;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // Example of a call to a native method
        TextView tv = binding.sampleText;


        ModifyMacUtils.init(ModifyMacUtils.getAppInfo(getApplicationContext()));

        Log.d(TAG, "limemodifyParams: " + ModifyMacUtils.modifyParams("123456789"));

    }



}
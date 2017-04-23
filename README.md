# WaveView

有一天, UI脑洞大开, 想设计一个炫酷的个人信息界面, 嗯, 波浪流动的动态效果背景不错, 做一个这个吧: <br/>
<br/>
<img src="screenshot/ScreenShot1.gif" width="320px"/><br/>
<br/>
UI说, 我给几张图, 你自己挪吧.<br/>
<br/>
作为一个有灵魂的程序员, 我立马say NO!<br/>
<br/>
于是, 波浪流动的动态效果的自定义控件应运而生.<br/>
<br/>
希望有人会喜欢~<br/>

## Gradle Build

### **Step 1.** Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
### **Step 2.** Add the dependency
```
dependencies {
        compile 'com.github.SenhLinsh:WaveView:1.0.0'
}
```

## How To Use

XML:

```
    <com.linsh.waveview.WaveView
        android:id="@+id/waveview"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
```

Activity:

```
        int color = Color.parseColor("#55303F9F");
        Wave wave1 = new Wave(1080, 30, 5, 45, color);
        Wave wave2 = new Wave(1620, 26, -6, 50, color);
        Wave wave3 = new Wave(2080, 3, 3, 300, color);
        waveView.addWave(wave1);
        waveView.addWave(wave2);
        waveView.addWave(wave3);
```

or

```
        LinearGradient shader = new LinearGradient(0, 0, 0, 1920, Color.parseColor("#303F9F"), Color.parseColor("#553F51B5"), Shader.TileMode.CLAMP);
        PercentWave wave1 = new PercentWave(1.50f, 0.03f, 0.018f, 0.11f, shader);
        PercentWave wave2 = new PercentWave(1.28f, 0.02f, -0.02f, 0.12f, shader);
        PercentWave wave3 = new PercentWave(2.08f, 0.01f, 0.01f, 0.20f, shader);
        waveView.addWave(wave1);
        waveView.addWave(wave2);
        waveView.addWave(wave3);
```
<br/>

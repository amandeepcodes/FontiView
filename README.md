# FontiView
Custom View to add Custom fonts from xml 
FontiViews
===========

FontiViews
===========


Use custom fonts to xml layout views.

Are you fed up to set custom fonts to your textviews,Button and EditText or implkementing your HTML code to textview then this library is for you. 

![alt text](https://github.com/AmanChugh/FontiView/blob/master/fontview.png width="350" "ScreenShot Of Android device")

## Getting started

### Dependency


```groovy
dependencies {
    compile 'compile 'com.aman.fontilib:fontilib:1.0.0'
}
```
### Add Fonts

Add your fonts files to `assets/fonts`. All font definitions are relative to this path.

![alt text](https://github.com/AmanChugh/FontiView/blob/master/fonts.png "ScreenShot Of Fonts directory")


### Usage

```xml
  <com.aman.fontilib.FontiEditText
        app:font="titi.ttf" />


    <com.aman.fontilib.FontiTextView
        android:text="@string/html_text"
        app:font="titi.ttf"
        app:html="true">

    </com.aman.fontilib.FontiTextView>

    <com.aman.fontilib.FontiButton
        app:font="titi.ttf" />

``` 


## Usage

### Add Custom view to set font bind HTML text 

```xml
  <com.aman.fontilib.FontiEditText
        android:layout_width="368dp"
        android:layout_height="wrap_content"
        android:hint="This is EditText."
        app:font="titi.ttf" />


    <com.aman.fontilib.FontiTextView
        android:layout_width="368dp"
        android:layout_height="wrap_content"
        android:text="@string/html_text"
        android:textSize="22sp"
        app:font="titi.ttf"
        app:html="true">

    </com.aman.fontilib.FontiTextView>

    <com.aman.fontilib.FontiButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:text="Button with Custom Typeface."
        app:font="titi.ttf" />

```

# Licence

    Copyright 2013 Christopher Jenkins
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.




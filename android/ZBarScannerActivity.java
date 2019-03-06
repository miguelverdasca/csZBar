<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/csZbarScannerView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:background="@color/csZbarScannerBackground" >

    <LinearLayout
        android:id="@+id/linearTopLayout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#E5E5E5">

        <ImageView
            android:id="@+id/csZbarScannerImageLogo"
            android:layout_width="match_parent"
            android:layout_height="50dp"
            android:layout_margin="25dp"
            android:paddingLeft="5dp"
            android:paddingTop="5dp"
            android:paddingRight="5dp"
            android:paddingBottom="5dp"
            android:layout_gravity="top|center_horizontal"
            android:background="#E5E5E5"
            android:gravity="center"
            android:src="@drawable/docdigitizer_scanner_2" />
    </LinearLayout> 

<TextView android:id="@+id/csZbarScannerInstructions"
        android:layout_gravity="center|bottom"
        android:layout_width="match_parent"
        android:layout_height="100dp"
        android:paddingTop="5dp"
        android:paddingBottom="20dp"
        android:paddingLeft="50dp"
        android:paddingRight="50dp"
        android:gravity="center"
        android:textSize="8pt"
        android:textColor="@color/csZbarScannerTextColor"
        android:background="@color/csZbarScannerTextBackground"
        android:fontFamily="sans-serif-light"
        android:text="@string/csZbarScannerInstructions" />

    <RelativeLayout android:id="@+id/csZbarScannerSightContainer"
        android:layout_width="wrap_content"
        android:layout_height="fill_parent"
        android:layout_gravity="center_horizontal|bottom">

        <View android:id="@+id/csZbarScannerSight"
            android:layout_width="match_parent"
            android:layout_height="1dp"
            android:layout_marginLeft="10dp"
            android:layout_marginRight="10dp"
            android:layout_centerInParent="true"
            android:gravity="center_vertical"
            android:background="#ff0000" />

        <ImageButton
            android:layout_width="50dp"
            android:layout_height="60dp"
            android:layout_margin="20dp"
            android:id="@+id/imageButton"
            android:src="@drawable/camera_flash"
            android:background="@color/csZbarScannerTextBackground"
            android:onClick="toggleFlash"
            android:longClickable="true"
            android:visibility="visible"
            android:layout_alignParentBottom="true"
            android:layout_alignParentRight="true"
            android:layout_alignParentEnd="true" />
    </RelativeLayout>
</FrameLayout>

# DemoForFresco
Demo for Fresco, using Android Studio IDE

# key point
1. add dependency ```compile 'com.facebook.fresco:fresco:0.9.0+' ```
2. modify layout xml
```xml
       <com.facebook.drawee.view.SimpleDraweeView
        android:id="@+id/image2"
        android:layout_width="200dp"
        android:layout_height="300dp"
        android:layout_below="@id/image1"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="20dp"
        fresco:placeholderImage="@color/image_placeholder" >
      </com.facebook.drawee.view.SimpleDraweeView>
```
3. modify java code
```
        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) findViewById(R.id.image2);
        Uri aniImageUri = Uri.parse("https://camo.githubusercontent.com/588a2ef2cdcfb6c71e88437df486226dd15605b3/687474703a2f2f737261696e2d6769746875622e71696e6975646e2e636f6d2f756c7472612d7074722f73746f72652d686f7573652d737472696e672d61727261792e676966");
        ImageRequest request = ImageRequestBuilder.newBuilderWithSource(aniImageUri)
                .build();

        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setImageRequest(request)
                .setAutoPlayAnimations(true)
                .build();
        simpleDraweeView2.setController(controller);
  ```
4. add the internet permission
``` <uses-permission android:name="android.permission.INTERNET" />```

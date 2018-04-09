//监听音量键，做出相应动作，不显示音量变化

@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            //音量下键按下
            
            Toast.makeText(this, " STOP", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            //音量上键按下
            
            Toast.makeText(this, " GO", Toast.LENGTH_LONG).show();
            return true;
        }
        //return super.onKeyDown(keyCode, event);
        return true;
    }

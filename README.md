# ViewPager
实现左右切换页卡功能，可自定义属性

1.在xml文件中添加该组件
<com.viewpager.TabViewPager />

2.在java文件中对tab属性进行设置，可选
viewPager.addTitles(titleList);  //添加标题
viewPager.addFragments(fragmentList); //添加页面
viewPager.setTabIndicatorColor(getResources().getColor(R.color.colorPrimary));  //下划线颜色
viewPager.setSelectedTabIndicatorHeight(10); //下划线高度
viewPager.setTabTextColors(Color.BLACK,getResources().getColor(R.color.colorPrimary)); //导航栏文字颜色：普通状态下、选中状态下
viewPager.setTabMode(TabLayout.MODE_SCROLLABLE); 是否可滑动：fixed：固定；scrollable：可滑动
viewPager.setTabGravity(Gravity.CENTER); 
viewPager.setTabPadding(10,10,10,10); 
viewPager.setTabBackground(Color.WHITE); //导航栏颜色
viewPager.setAdapter();  //设置适配器，必选

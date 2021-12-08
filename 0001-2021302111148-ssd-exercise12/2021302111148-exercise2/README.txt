1.首先，在教程中看到了 servlet里的<servlet-class>需要填全类名，于是填了classes.FirstServlet.
后来才知道全类名到classes为止
2.写form的action属性时在前边把映射路径之间写上去了，所以多加了一个“/“
3.搞不懂name和value的区别，后来明白name是给servlet看的，但是如果不想让text和password
输入框在一开始就有内容的话，这两种input的value就没用吗？
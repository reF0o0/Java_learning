public class type_conversion_demo1 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;

        int c = a + b;

        byte d = 10;
        double e = 20;
        double f = d + e;

        int g = 10;
        byte h = (byte) g;

        byte i = (byte) (c + f + h);
        System.out.println(i);
    }
}

// byte < short < int < long < float < double
// 不傻一路飞碟 boss said i like fast dining

/*
 * 隐式转换(前面补0)
 * 触发时机：不同类型的数据进行计算，默认采取隐式转换，Java自动转换，无需我们写代码
 * 转换步骤1：如有byteshort类型的数据，先提升为int类型
 * 转换步骤2：把取值范围小的提升为取值范围大的，再进行运算
 */

/*
 * 强制转换(去掉不要的)
 * 弊端：导致数据丢失
 * 触发时机：强制转换不会自动触发，需要手动书写代码
 * 书写格式：目标数据类型变量名=（目标数据类型）被强转的数据
 */
package JavaAdvance.JavaOOP.ReflectionAndAnnotation.Lab.Reflection;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    private static class MethodComparator implements Comparator<Method> {

        @Override
        public int compare(Method f, Method s) {
            boolean firstIsGetter = f.getName().startsWith("get");
            boolean secondIsGetter = s.getName().startsWith("get");

            if (firstIsGetter && secondIsGetter) {
                return f.getName().compareTo(s.getName());
            }

            boolean firstIsSetter = f.getName().startsWith("set");
            boolean secondIsSetter = s.getName().startsWith("set");

            if (firstIsSetter && secondIsSetter) {
                return f.getName().compareTo(s.getName());
            }

            return Boolean.compare(secondIsGetter, firstIsGetter);
        }
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        /* zad 1
        Class<Reflection> aClass = Reflection.class;
        System.out.println(aClass);
        System.out.println(aClass.getSuperclass());

        Class[] interfaces = aClass.getInterfaces();
        for (Class item : interfaces) {
            System.out.println(item);
        }

        Constructor<Reflection> ctor = aClass.getDeclaredConstructor();
        Reflection ref = ctor.newInstance();
        System.out.println(ref);

        //zad 2
        Method[] methods = Reflection.class.getDeclaredMethods();
        Method[] getters = Arrays.stream(methods)
                .filter(m -> m.getName().startsWith("get") && m.getParameterCount() == 0)
                .sorted(Comparator.comparing(Method::getName))
                .toArray(Method[]::new);
        Arrays.stream(getters).forEach(m ->
                System.out.printf("%s will return class %s\n",
                        m.getName(), m.getReturnType().getName()));



        Class<Reflection> calzz = Reflection.class;

        Method[] methods = calzz.getDeclaredMethods();

        Comparator<Method> comparator = Comparator.comparing(Method::getName);

        Set<Method> getter = new TreeSet<>(comparator);
        Set<Method> setter = new TreeSet<>(comparator);

        for (Method method : methods) {
            String methodName = method.getName();

            if(methodName.contains("get")){
                getter.add(method);
            } else if(methodName.contains("setter")){
                setter.add(method);
            }
        }

        for (Method item : getter) {
            System.out.printf("%s will return class %s\n", item.getName(), item.getReturnType().getName());
        }

        for (Method item : setter) {
            System.out.printf("%s and will set field of class %s\n", item.getName(), item.getParameterTypes()[0].getName());
        }



        Class<Reflection> clazz = Reflection.class;

        Method[] allMethods = clazz.getDeclaredMethods();

        Arrays.stream(allMethods)
                .filter(m -> !m.getName().equals("toString"))
                .sorted(new MethodComparator())
                .forEach(Main::printMethodInfo);

         */


        Class<Reflection> clazz = Reflection.class;

        Arrays.stream(clazz.getDeclaredFields())
                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f -> System.out.println(f.getName() + " must be private!"));

        Method[] declaredMethods = Arrays.stream(clazz.getDeclaredMethods())
                .filter(m -> !m.getName().equals("toString"))
                .toArray(Method[]::new);

        Arrays.stream(declaredMethods)
                .filter(m -> m.getReturnType() != void.class)
                .filter(m -> !Modifier.isPublic(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.println(m.getName() + " have to be public!"));

        Arrays.stream(declaredMethods)
                .filter(m -> m.getReturnType() == void.class)
                .filter(m -> !Modifier.isPrivate(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.println(m.getName() + " have to be private!"));

    }

    private static void printMethodInfo(Method m) {
        System.out.println(m.getName().startsWith("get")
                ? String.format("%s will return class %s", m.getName(),
                m.getReturnType().getSimpleName())
                : String.format("%s and will set field of class %s", m.getName(),
                m.getParameterTypes()[0].getSimpleName()));
    }
}

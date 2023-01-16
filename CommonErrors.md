
**After adding @Controller**
---

@Controller

public class PropertyInjectedController {
}

----------- Property

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.tp.di.services.GreetingService.sayGreeting()" because "this.greetingService" is null
at com.tp.di.controllers.PropertyInjectedController.getGreeting(PropertyInjectedController.java:11)
at com.tp.di.SpringlDiApplication.main(SpringlDiApplication.java:30)

Now we get another issue: java.lang.NullPointerException: Cannot invoke...because "this.greetingService" is null
This is because, even if spring know that PropertyInjectedController is a bean now, it doesn't know
that it is supposed to be injecting greetingService

**Solution:**

Add **@Autowired** annotation to the property
This tells spring to go ahead and inject as instance of GreetingService. Of course to
inject the instance, that instance must exist first, but we don't have any of
GreetingService implementations which has been instantiated. Instantiation can be
done by making implementation classes as component class, for that add
**@Service** annotation, one of stereotype annotations, on implementation classes.


**Before adding @Controller**
---

----------- Property

Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'propertyInjectedController' available
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanDefinition(DefaultListableBeanFactory.java:892)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getMergedLocalBeanDefinition(AbstractBeanFactory.java:1318)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:300)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1130)
	at com.tp.di.SpringlDiApplication.main(SpringlDiApplication.java:29)
	
	
**Solution:**

As we can see above that we are getting
No bean named 'propertyInjectedController' available
This is because spring doesn't know that if it is a managed component
We need to make this a spring bean
add **@Controller** annotation




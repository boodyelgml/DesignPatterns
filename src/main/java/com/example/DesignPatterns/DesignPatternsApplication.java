package com.example.DesignPatterns;

import com.example.DesignPatterns.Behavioral.command.ClientWritePlatformService;
import com.example.DesignPatterns.Behavioral.iterator.MyIterator;
import com.example.DesignPatterns.Behavioral.chainOfResponsibility.HighLevelEmployee;
import com.example.DesignPatterns.Behavioral.chainOfResponsibility.LowLevelEmployee;
import com.example.DesignPatterns.Behavioral.chainOfResponsibility.MidLevelEmployee;
import com.example.DesignPatterns.Behavioral.chainOfResponsibility.Request;
import com.example.DesignPatterns.Behavioral.interpreter.OrExecution;
import com.example.DesignPatterns.Behavioral.interpreter.TerminalExecution;
import com.example.DesignPatterns.Behavioral.mediator.*;
import com.example.DesignPatterns.Behavioral.memento.Game;
import com.example.DesignPatterns.Behavioral.memento.Memento;
import com.example.DesignPatterns.Behavioral.observer.*;
import com.example.DesignPatterns.Behavioral.state.GreenState;
import com.example.DesignPatterns.Behavioral.state.Lamp;
import com.example.DesignPatterns.Behavioral.state.YellowState;
import com.example.DesignPatterns.Behavioral.strategy.Engineer;
import com.example.DesignPatterns.Behavioral.strategy.Kia;
import com.example.DesignPatterns.Behavioral.template.GTA;
import com.example.DesignPatterns.Behavioral.visitor.AGM;
import com.example.DesignPatterns.Behavioral.visitor.Tanmeyah;
import com.example.DesignPatterns.Behavioral.visitor.TaxesVisitorImpl;
import com.example.DesignPatterns.Creational.abstractfactory.BootstrapFormBuilder;
import com.example.DesignPatterns.Creational.abstractfactory.Button;
import com.example.DesignPatterns.Creational.abstractfactory.FormBuilder;
import com.example.DesignPatterns.Creational.abstractfactory.TextBox;
import com.example.DesignPatterns.Creational.builder.Student;
import com.example.DesignPatterns.Creational.builder.StudentBuilder;
import com.example.DesignPatterns.Creational.factory.Shape;
import com.example.DesignPatterns.Creational.factory.ShapeFactory;
import com.example.DesignPatterns.Creational.prototype.Person;
import com.example.DesignPatterns.Structural.adapter.Lanos;
import com.example.DesignPatterns.Structural.adapter.OldCarAdapter;
import com.example.DesignPatterns.Structural.bridge.*;
import com.example.DesignPatterns.Structural.decorator.CheesePizza;
import com.example.DesignPatterns.Structural.decorator.ChickenPizza;
import com.example.DesignPatterns.Structural.decorator.Pizza;
import com.example.DesignPatterns.Structural.decorator.SimplePizza;
import com.example.DesignPatterns.Structural.proxy.Image;
import com.example.DesignPatterns.Structural.proxy.ProxyImage;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DesignPatternsApplication {
    public static void main(String[] args) throws InterruptedException {

        //<editor-fold desc="Behavioral Patterns">

        System.out.println("------- observer pattern -------");
        Observable ahmed = new AhmedObservable();
        Observer mohamed = new MohamedObserver();
        Observer mustafa = new MustafaObserver();
        ahmed.attach(mohamed);
        ahmed.attach(mustafa);
        mohamed.setObservable(ahmed);
        mohamed.hitObservable("ayyy!");


        System.out.println("------- Chain of responsibility pattern -------");
        LowLevelEmployee lowLevelEmployee = new LowLevelEmployee();
        MidLevelEmployee midLevelEmployee = new MidLevelEmployee();
        HighLevelEmployee highLevelEmployee = new HighLevelEmployee();
        lowLevelEmployee.setNextHandler(midLevelEmployee);
        midLevelEmployee.setNextHandler(highLevelEmployee);
        Request request = new Request("high", "");
        lowLevelEmployee.handleRequest(request);


        System.out.println("------- interpreter pattern -------");
        TerminalExecution execution = new TerminalExecution("hamada");
        TerminalExecution execution2 = new TerminalExecution("ali");
        OrExecution execution3 = new OrExecution(execution, execution2);
        System.out.println(execution3.interpret("ali"));


        System.out.println("------- iterator pattern -------");
        int[] data = {1, 2, 3, 4, 5};
        MyIterator iterator = new MyIterator(data);
        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println(value);
        }


        System.out.println("------- Mediator pattern -------");
        Mediator mediator = new AirTower();
        Client boeing = new Boeing(mediator);
        Client airbus = new AirBus(mediator);
        mediator.requestLanding(airbus);
        mediator.registerClient(airbus);
        mediator.requestLanding(airbus);
        mediator.registerClient(boeing);
        mediator.requestLanding(boeing);
        mediator.notifyEmpty();
        mediator.requestLanding(boeing);
        mediator.notifyEmpty();


        System.out.println("------- momento pattern -------");
        Game game = new Game();
        game.save(new Memento("first checkpoint"));
        game.save(new Memento("second checkpoint"));
        game.revert();


        System.out.println("------- state pattern -------");
        Lamp lamp = new Lamp();
        lamp.setState(new YellowState(lamp));
        lamp.getColor();
        lamp.setState(new GreenState(lamp));
        lamp.getColor();


        System.out.println("------- strategy pattern -------");
        Engineer engineer = new Engineer(new Kia());
        engineer.repair();


        System.out.println("------- template method pattern -------");
        GTA gta = new GTA();
        gta.load();


        System.out.println("------- visitor method pattern -------");
        AGM agm = new AGM();
        agm.acceptVisit(new TaxesVisitorImpl());

        Tanmeyah tanmeyah = new Tanmeyah();
        tanmeyah.acceptVisit(new TaxesVisitorImpl());

        System.out.println("------- command pattern -------");
        // Check ClientController
        //</editor-fold>

        //<editor-fold desc="Creational Patterns">

        System.out.println("------- Adapter pattern -------");
        OldCarAdapter oldCarAdapter = new OldCarAdapter(new Lanos());
        oldCarAdapter.on();
        oldCarAdapter.off();


        System.out.println("------- Bridge pattern -------");
        Team barca = new Barcelona(new Messi());
        barca.startPlaying();
        Team psg = new PSG(new Neymar());
        psg.startPlaying();


        System.out.println("------- Decorator pattern -------");
        Pizza pizza = new SimplePizza();
        CheesePizza cheesePizza = new CheesePizza(pizza);
        ChickenPizza chickenPizza = new ChickenPizza(cheesePizza);
        System.out.println(chickenPizza.price());
        System.out.println(chickenPizza.name());


        System.out.println("------- Proxy pattern -------");
        Image image = new ProxyImage("real image");
        image.display();
        //</editor-fold>

        //<editor-fold desc="Creational Patterns">
        System.out.println("------- Builder pattern -------");
        Student student = new StudentBuilder().withName("student name from builder").withAge(20).build();
        System.out.println(student.getName());


        System.out.println("------- Factory pattern -------");
        Shape shape = ShapeFactory.createShape("Circle");
        shape.draw();


        System.out.println("------- Abstract Factory pattern -------");
        FormBuilder builder = new BootstrapFormBuilder();
        Button button = builder.createButton();
        button.click();


        TextBox textBox = builder.createTextBox();
        textBox.typeText();


        System.out.println("------- Prototype pattern -------");
        Person person = new Person("ahmed", 20);
        Person newPerson = person.clone();
        System.out.println(person);
        System.out.println(newPerson);
        //</editor-fold>
    }
}

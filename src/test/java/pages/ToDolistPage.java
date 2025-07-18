package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ToDolistPage {

    public ToDolistPage(){
        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);}

@FindBy(xpath ="//*[@text='Welcome to To-do List']" )
public WebElement yazi;

    @FindBy(xpath ="//*[@text='CONTINUE']" )
    public WebElement Continueyazi;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/toolbar_back")
    public WebElement xButonu;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/dialog_pro_first_close")
    public WebElement IkinciXButonu;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/iv_task_add")
    public WebElement GorevEklemeButonu;

    @FindBy(xpath = "//*[@text='Input new task here']")
    public WebElement GorevYazmaBox;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/task_create_btn")
    public WebElement GorevKaydetmeBox;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/task_text")
    public WebElement KaydedilmisGore;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/task_detail_more")
    public WebElement ucNokta;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/detail_delete")
    public WebElement deleteGorev;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/dialog_confirm")
    public WebElement deleteConfirmGorev;


    }





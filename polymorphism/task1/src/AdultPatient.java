import java.util.ArrayList;

public class AdultPatient extends Person implements Diagnosticable,Employable
{
    int systolic, diastolic;
    double temperature;
    ArrayList<String> jobs;

    @Override
    public ArrayList<String> getPreviousJobs(){return this.jobs;}

    @Override
    public void addJob(String job)
    {
        if(this.jobs == null)
        {
            this.jobs = new ArrayList<String>();
        }
        this.jobs.add(job);
    }

    @Override
    public boolean hasFever() {
        return this.temperature > 100.4;
    }

    @Override
    public int getSystolic()
    {
        return this.systolic;
    }

    @Override
    public int getDiastolic()
    {
        return this.diastolic;
    }

    @Override
    public void setTemperature(double t)
    {
        this.temperature = t;
    }

    @Override
    public double getTemperature()
    {
        return this.temperature;
    }

    @Override
    public void setSystolic(int systolic)
    {
        this.systolic = systolic;
    }

    @Override
    public void setDiastolic(int diastolic)
    {
        this.diastolic = diastolic;
    }
}

/* TODO
Implement the class Adult Patient. 
An adult patient is a Person that is Diagnosticable and that is Employable.*/
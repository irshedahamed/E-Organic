package com.example.shs.farmer;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Dbconnection extends Activity {

    final String HEADER = "Content-Type=application/json";
    public String flag = "start";

    //Private Class and Method to Check Credentials
    private class  DbAuthenticate extends AsyncTask<String,Void,Void>{
        String type="invalid";
        @Override
        protected Void doInBackground(String... strings) {
            String json = strings[0];
            Log.i("Rest Request","sent");
            String res = HttpClient.post(ServerPath.path+"/Rest/Authenticate",HEADER,json,null);
            Log.i("rest response","received");
            JSONParser parser = new JSONParser();
            try {
                JSONObject obj = (JSONObject) parser.parse(res);
                String temp = (String) obj.get("result");
                this.type = temp;
                flag = "found";
            } catch (ParseException e) {
                e.printStackTrace();
            }
           // Log.i("type",type);
            return null;
        }
    }
    public String checkLogin(String json) {
        String result = null;
        DbAuthenticate dba = new DbAuthenticate();
        dba.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,json);
        while(flag.equals("start")){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(flag.equals("found")){
            flag ="start";
            result = dba.type;
        }
        return result;
    }

    //Insert user into database
    private class DbInsertUser extends AsyncTask<String,Void,Void>{
        String userid;
        @Override
        protected Void doInBackground(String... strings) {
            String json = strings[0];
            String res = HttpClient.post(ServerPath.path+"/Rest/InsertUser",HEADER,json,null);
            JSONParser parser = new JSONParser();
            this.userid = res;
            flag = "found";
            return null;
        }
    }

    public String insertUserdb(String json) {
        String result = null;
        DbInsertUser dba = new DbInsertUser();
        dba.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,json);
        while(flag.equals("start")){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(flag.equals("found")){
            flag ="start";
            result = dba.userid;
        }
        return result;
    }

    //Insert Farmer into database
    private class DbInsertFarmer extends AsyncTask<String,Void,Void>{
        String userid;
        @Override
        protected Void doInBackground(String... strings) {
            String json = strings[0];
            String res = HttpClient.post(ServerPath.path+"/Rest/InsertFarmer",HEADER,json,null);
            JSONParser parser = new JSONParser();
            this.userid = res;
            flag = "found";
            return null;
        }
    }

    public String insertFarmerdb(String json) {
        String result = null;
        DbInsertFarmer dba = new DbInsertFarmer();
        dba.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,json);
        while(flag.equals("start")){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(flag.equals("found")){
            flag ="start";
            result = dba.userid;
        }
        return result;
    }

    //Insert item details
    private class DbInsertItem extends AsyncTask<String,Void,Void>{
        String res;
        @Override
        protected Void doInBackground(String... strings) {
            String json = strings[0];
            this.res = HttpClient.post(ServerPath.path+"/Rest/InsertItem",HEADER,json,null);
            flag = "found";
            return null;
        }
    }
    public String insertItemdb(String json){
        DbInsertItem dba = new DbInsertItem();
        dba.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,json);
        while(flag.equals("start")){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(flag.equals("found")){
            flag ="start";
        }
        return dba.res;
    }
    //Fetch item details
    private class DbFetchItem extends AsyncTask<String,Void,Void>{
        String res;
        @Override
        protected Void doInBackground(String... strings) {
            String json = strings[0];
            this.res = HttpClient.post(ServerPath.path+"/Rest/FetchItem",HEADER,json,null);
            flag = "found";
            return null;
        }
    }
    public String fetchItemdb(String json){
        DbFetchItem dba = new DbFetchItem();
        dba.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,json);
        while(flag.equals("start")){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(flag.equals("found")){
            flag ="start";
        }
        return dba.res;
    }

    //Fetch item details
    private class DbFetchFarm extends AsyncTask<String,Void,Void>{
        String res;
        @Override
        protected Void doInBackground(String... strings) {
            String json = strings[0];
            this.res = HttpClient.post(ServerPath.path+"/Rest/FetchDisplay",HEADER,json,null);
            flag = "found";
            return null;
        }
    }
    public String fetchFarmdb(String json){
        DbFetchFarm dba = new DbFetchFarm();
        dba.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,json);
        while(flag.equals("start")){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(flag.equals("found")){
            flag ="start";
        }
        return dba.res;
    }
}

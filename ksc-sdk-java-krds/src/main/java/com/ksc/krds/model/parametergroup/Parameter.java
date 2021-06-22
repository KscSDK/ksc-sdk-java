package com.ksc.krds.model.parametergroup;

import java.util.List;

public class Parameter {

    private Object Min;
    private Object Default;
    private Object Max;
    private Boolean RestartRequired;
    private String Type;
    private String Alias;
    private Boolean Ignore;
    private Object DefaultScaleFactor;
    private Object MaxScaleFactor;
    private Object MinScaleFactor;
    private Object SecondMin;
    private Object Step;
    private String Variable;
    private List<String> Enums;

    public Object getMin() {
        return Min;
    }

    public void setMin(Object min) {
        Min = min;
    }

    public Object getDefault() {
        return Default;
    }

    public void setDefault(Object aDefault) {
        Default = aDefault;
    }

    public Object getMax() {
        return Max;
    }

    public void setMax(Object max) {
        Max = max;
    }

    public Boolean getRestartRequired() {
        return RestartRequired;
    }

    public void setRestartRequired(Boolean restartRequired) {
        RestartRequired = restartRequired;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String alias) {
        Alias = alias;
    }

    public Boolean getIgnore() {
        return Ignore;
    }

    public void setIgnore(Boolean ignore) {
        Ignore = ignore;
    }

    public Object getDefaultScaleFactor() {
        return DefaultScaleFactor;
    }

    public void setDefaultScaleFactor(Object defaultScaleFactor) {
        DefaultScaleFactor = defaultScaleFactor;
    }

    public Object getMaxScaleFactor() {
        return MaxScaleFactor;
    }

    public void setMaxScaleFactor(Object maxScaleFactor) {
        MaxScaleFactor = maxScaleFactor;
    }

    public Object getMinScaleFactor() {
        return MinScaleFactor;
    }

    public void setMinScaleFactor(Object minScaleFactor) {
        MinScaleFactor = minScaleFactor;
    }

    public Object getSecondMin() {
        return SecondMin;
    }

    public void setSecondMin(Object secondMin) {
        SecondMin = secondMin;
    }

    public Object getStep() {
        return Step;
    }

    public void setStep(Object step) {
        Step = step;
    }

    public String getVariable() {
        return Variable;
    }

    public void setVariable(String variable) {
        Variable = variable;
    }

    public List<String> getEnums() {
        return Enums;
    }

    public void setEnums(List<String> enums) {
        Enums = enums;
    }
}

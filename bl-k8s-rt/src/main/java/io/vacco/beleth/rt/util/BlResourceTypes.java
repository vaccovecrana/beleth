package io.vacco.beleth.rt.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class BlResourceTypes {

  public static final Set<String> internalTypes = new TreeSet<>();

  private static final Map<String, Integer> priorityMap = new HashMap<>();

  static {
    // Types internal to the cluster. No need to manage these.
    internalTypes.add("localsubjectaccessreviews");
    internalTypes.add("selfsubjectreviews");
    internalTypes.add("bindings");
    internalTypes.add("subjectaccessreviews");
    internalTypes.add("tokenreviews");
    internalTypes.add("selfsubjectaccessreviews");
    internalTypes.add("selfsubjectrulesreviews");

    // Foundational Resources [0, 100]
    priorityMap.put("namespaces", 0);                   // Highest priority in this layer
    priorityMap.put("nodes", 20);                       // Nodes come after namespaces
    priorityMap.put("storageclasses", 40);              // StorageClasses are set before PersistentVolumes
    priorityMap.put("persistentvolumes", 60);           // PersistentVolumes come last in this layer

    // Cluster-Wide Resources [101, 200]
    priorityMap.put("customresourcedefinitions", 101);  // CRDs define custom resource types
    priorityMap.put("apiservices", 120);                // API services depend on CRDs
    priorityMap.put("clusterroles", 140);               // ClusterRoles define cluster-wide permissions
    priorityMap.put("clusterrolebindings", 160);        // ClusterRoleBindings associate roles with users

    // Name-spaced Infrastructure Resources [201, 300]
    priorityMap.put("serviceaccounts", 201);            // ServiceAccounts are required by Pods and other resources
    priorityMap.put("roles", 220);                      // Roles define permissions within a namespace
    priorityMap.put("rolebindings", 240);               // RoleBindings associate Roles with ServiceAccounts
    priorityMap.put("secrets", 260);                    // Secrets contain sensitive data, set before ConfigMaps
    priorityMap.put("configmaps", 280);                 // ConfigMaps are set after Secrets
    priorityMap.put("limitranges", 290);                // LimitRanges enforce resource usage limits
    priorityMap.put("resourcequotas", 295);             // ResourceQuotas define usage limits across a namespace

    // Networking Resources [301, 400]
    priorityMap.put("networkpolicies", 301);            // NetworkPolicies define traffic rules
    priorityMap.put("services", 320);                   // Services expose network endpoints for applications
    priorityMap.put("endpoints", 340);                  // Endpoints are targeted by Services
    priorityMap.put("endpointslices", 360);             // EndpointSlices follow Endpoints
    priorityMap.put("ingresses", 380);                  // Ingresses manage external access to Services

    // Workload Resources [401, 500]
    priorityMap.put("persistentvolumeclaims", 401);     // PVCs request storage from PersistentVolumes
    priorityMap.put("statefulsets", 420);               // StatefulSets manage stateful applications
    priorityMap.put("daemonsets", 440);                 // DaemonSets run Pods on all or a subset of nodes
    priorityMap.put("deployments", 460);                // Deployments manage stateless applications
    priorityMap.put("replicasets", 480);                // ReplicaSets maintain the desired number of Pods
    priorityMap.put("pods", 500);                       // Pods are the basic deployable units in Kubernetes

    // Higher-Level Resources [501, 600]
    priorityMap.put("leases", 501);                     // Leases are used in leader election and coordination
    priorityMap.put("poddisruptionbudgets", 520);       // PodDisruptionBudgets ensure availability during disruptions
    priorityMap.put("horizontalpodautoscalers", 540);   // HPAs manage scaling of workloads
    priorityMap.put("jobs", 560);                       // Jobs represent batch tasks that run to completion
    priorityMap.put("cronjobs", 580);                   // CronJobs schedule Jobs to run at specific times

    // Final Layer Resources [601, 700]
    priorityMap.put("componentstatuses", 601);          // ComponentStatuses provide diagnostic information
    priorityMap.put("bindings", 620);                   // Bindings bind a Pod to a specific Node
    priorityMap.put("podtemplates", 640);               // PodTemplates are blueprints for Pods
    priorityMap.put("events", 660);                     // Events provide a record of state changes in the cluster
  }

  public static int priorityOf(String kind) {
    return priorityMap.getOrDefault(kind, 100);    // if the resource type is unknown.
  }

}

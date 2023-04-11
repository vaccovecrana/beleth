package io.k8s.api.core.v1.taint;

/**
 * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
 *
 * Possible enum values:
 *  - `&#34;NoExecute&#34;` Evict any already-running pods that do not tolerate the taint. Currently enforced by NodeController.
 *  - `&#34;NoSchedule&#34;` Do not allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods submitted to Kubelet without going through the scheduler to start, and allow all already-running pods to continue running. Enforced by the scheduler.
 *  - `&#34;PreferNoSchedule&#34;` Like TaintEffectNoSchedule, but the scheduler tries not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto the node entirely. Enforced by the scheduler.
 */
public enum Effect {
  NoExecute,

  NoSchedule,

  PreferNoSchedule
}
